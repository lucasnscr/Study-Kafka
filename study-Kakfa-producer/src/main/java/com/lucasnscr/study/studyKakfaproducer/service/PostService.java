package com.lucasnscr.study.studyKakfaproducer.service;

import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.lucasnscr.study.studyKakfaproducer.domain.Post;
import com.lucasnscr.study.studyKakfaproducer.domain.PostList;

import reactor.core.publisher.Mono;

public class PostService {

	private KafkaTemplate<String, Post> kafkaTemplate;
	private final String KAFKA_TOPIC = "posts";

	public PostService(KafkaTemplate<String, Post> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void analyze(String name) {
		Mono<PostList> postsListMono = WebClient.create().get()
				.uri("https://api.domainsdb.info/v1/domains/search?domain=" + name + "&zone=com")
				.accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(PostList.class);
		
		postsListMono.subscribe(postList -> {
			postList.getPosts()
			.forEach(post ->{
				kafkaTemplate.send(KAFKA_TOPIC, post);
				System.out.println("post message" + post.getCNAME());
			});
			
		});

	}

}

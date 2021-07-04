package com.lucasnscr.study.studyKakfaconsumer;

import java.util.function.Consumer;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lucasnscr.study.studyKakfaconsumer.domain.Post;

@Configuration
public class PostConsumer {

	@Bean
	public Consumer<KStream<String, Post>> domainService() {
		return kstream -> kstream.foreach((key, post) -> {
			System.out.println(String.format("Post consumed[%s] Status[%s]", post.getDomain(), post.isDead()));
		});
	}

}

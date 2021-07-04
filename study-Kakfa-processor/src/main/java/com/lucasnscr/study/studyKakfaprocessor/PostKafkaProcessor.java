package com.lucasnscr.study.studyKakfaprocessor;

import java.util.function.Function;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lucasnscr.study.studyKakfaprocessor.domain.Post;

@Configuration
public class PostKafkaProcessor {
	
	@Bean
	public Function<KStream<String, Post>, KStream<String, Post>> postProcessor(){
	    return kstream -> kstream.filter((key, post) -> {
	        if (post.isDead()) {
	          System.out.println("Inactive Domain: " + post.getDomain());
	        } else {
	          System.out.println("Active Domain: " + post.getDomain());
	        }
	        return !post.isDead();
	      });
		
	}

}

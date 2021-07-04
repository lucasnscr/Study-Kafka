package com.lucasnscr.study.studyKakfaproducer.domain;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PostList implements Serializable{
	private static final long serialVersionUID = 1L;
	private List<Post> posts;
}

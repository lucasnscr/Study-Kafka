package com.lucasnscr.study.studyKakfaproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasnscr.study.studyKakfaproducer.service.PostService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/post")
public class PostController {

	private PostService postService;

	PostController(PostService postService) {
		this.postService = postService;
	}

	@ApiOperation(value = "create post in social media")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "done"),
			@ApiResponse(code = 422, message = "exception"), })
	@GetMapping("/analyze/{name}")
	public String analyze(@PathVariable("name") final String name) {
		postService.analyze(name);
		return "Analyze discard your data";
	}

}

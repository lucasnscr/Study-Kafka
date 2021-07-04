package com.lucasnscr.study.studyKakfaproducer.dto;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ProducerPostResponseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private UUID idMessage;
	private String message;
	private List<String> listError;
	
}

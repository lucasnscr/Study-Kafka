package com.lucasnscr.study.studyKakfaconsumer.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Post implements Serializable {

	private static final long serialVersionUID = 1L;
	
	String domain;
	String create_date;
	String update_date;
	String country;
	boolean isDead;
	String A;
	String NS;
	String CNAME;
	String MX;
	String TXT;


}

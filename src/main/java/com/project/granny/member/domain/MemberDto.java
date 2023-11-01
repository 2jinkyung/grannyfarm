package com.project.granny.member.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
	
	private String id;
	
	private String pwd;
	
	private String name;
	
	private int age;
	
	private int phone;
	
	private boolean isDel;
	
	
}

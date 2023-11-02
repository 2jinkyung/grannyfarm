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
	
	private Integer no;
	
	private String id;
	
	private String pwd;
	
	private String name;
	
	private Integer age;
	
	private Integer phone;
	
	private boolean isDel;
	
	private boolean isSeller;
	
	
}

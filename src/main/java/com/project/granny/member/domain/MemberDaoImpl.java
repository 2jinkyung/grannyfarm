package com.project.granny.member.domain;

import java.lang.reflect.Member;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository("MemberDao")
public class MemberDaoImpl implements MemberDao{
	
	
	  private final SqlSession sqlSession;
	 

	@Override
	public MemberDto setMember(MemberDto dto) {
		return null;
	}
}

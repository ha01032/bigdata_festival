package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.MemberDto;
import com.example.demo.vo.MemberRequestDto;


@Mapper
public interface MemberMapper {
	
	MemberDto findMember(MemberRequestDto member);
	
	int insertMember(MemberDto member);
}

package com.example.demo.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.MemberMapper;
import com.example.demo.vo.MemberDto;
import com.example.demo.vo.MemberRequestDto;


import lombok.RequiredArgsConstructor;







@Service
@RequiredArgsConstructor
public class MemberService {

    //final 붙여야지 생성자 만들어줌
	@Autowired
    private final MemberMapper memberMapper;

    public MemberDto findMember(final MemberRequestDto member){
        return memberMapper.findMember(member);
    }

}
package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MemberService;
import com.example.demo.vo.MemberDto;
import com.example.demo.vo.MemberRequestDto;

import lombok.RequiredArgsConstructor;







@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MemberController {

	@Autowired
	private final MemberService memberService;
	
    @PostMapping("/login")
    public MemberDto login(@RequestBody final MemberRequestDto member) {
        return memberService.findMember(member);
    }

	
	
	
}

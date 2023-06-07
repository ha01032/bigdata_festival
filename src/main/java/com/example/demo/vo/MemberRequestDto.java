package com.example.demo.vo;

import java.time.LocalDateTime;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class MemberRequestDto {
	
	
	private String email;
	private String passwd;

	
	

}

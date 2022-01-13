package com.example.mini.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

//회원 가입 관련 요청을 처리하기 위한 UserController 와 회원 정보를 입력받을 SignupRequesDto 를 생성
public class SignupRequestDto {
    private String name;
    private String password;
    private String email;
    private boolean admin = false;
    private String adminToken = "";
}

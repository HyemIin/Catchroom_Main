package com.example.catchroom_be.domain.user.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RegisterRequest {
   /* @ValidEmail(message = "유효한 이메일 형식이 아닙니다.")
    @NotEmpty(message = "이메일은 비어있을 수 없습니다.")*/
    String email;
  /*  @ValidPassWord(message = "비밀번호 형식이 유효하지 않습니다.")
    @NotEmpty(message = "비밀번호는 비어있을 수 없습니다.")*/
    String password;
    /*@ValidEmail(message = "유효하지 않은 이메일 형식입니다.")
    @NotEmpty(message = "닉네임은 비어있을 수 없습니다.")*/
    String nickname;
  /*  @ValidPhoneNumber(message = "전화번호 형식이 올바르지 않습니다.")
    @NotEmpty(message = "전화번호는 비어있을 수 없습니다.")*/
    String phonenumber;
    /*@ValidName(message = "이름 형식이 올바르지 않습니다.")
    @NotEmpty(message = "이름은 비어있을 수 없습니다.")*/
    String name;

}
package com.example.catchroom_be.domain.test_user.dto;

import com.example.catchroom_be.domain.test_user.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class MemberLogInResponse {
    Long id;
    String email;
    String name;
    String accessToken;


    public static MemberLogInResponse fromEntity(Member member, String token) {
        return MemberLogInResponse.builder()
            .id(member.getId())
            .email(member.getEmail())
            .name(member.getName())
            .accessToken(token)
            .build();
    }
}
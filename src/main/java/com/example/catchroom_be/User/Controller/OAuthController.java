package com.example.catchroom_be.User.Controller;

import com.example.catchroom_be.User.Service.GoogleOAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class OAuthController {
    private final GoogleOAuthService googleOAuthService;

    @GetMapping("/oauth2/callback")
    public String getAuthCode(@RequestParam String authCode) {
        System.out.println("찍히는지 테스트");
        return googleOAuthService.getAccessToken(authCode);
    }
}


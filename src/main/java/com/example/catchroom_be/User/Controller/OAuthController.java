package com.example.catchroom_be.User.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class OAuthController {

    @PostMapping("/oauth2/callback")
    public String getAuthCode(@RequestParam String authCode) {
        return authCode;
    }
}


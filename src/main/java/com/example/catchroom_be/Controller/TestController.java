package com.example.catchroom_be.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/test")

public class TestController {

    @GetMapping("/do")
    public String Test() {
        return "나는 박건우입니다.";
    }
}

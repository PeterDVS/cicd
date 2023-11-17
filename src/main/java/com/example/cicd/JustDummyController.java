package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JustDummyController {
    @GetMapping("/cicd")
    public String getd() {
        return "Yep";
    }
}

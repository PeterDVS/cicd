package com.example.cicd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/cicd")
public class JustDummyController {
    @GetMapping
    public String get(@RequestHeader String authorization) {
        return "Yep";
    }
}

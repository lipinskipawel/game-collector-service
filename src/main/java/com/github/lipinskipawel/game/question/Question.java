package com.github.lipinskipawel.game.question;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question")
final class Question {

    @GetMapping("/hello")
    String hello() {
        return "hello";
    }
}

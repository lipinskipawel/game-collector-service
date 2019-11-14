package com.github.lipinskipawel.game.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
final class RestExample {

    private final BookRepo bookRepo;

    public RestExample(final BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @GetMapping("/hello")
    String hello() {
        final var save = bookRepo.save(new Book("nice title of book", 23));
        return save.getTitle();
    }

    @GetMapping("/all")
    List<Book> all() {
        return bookRepo.findAll();
    }
}
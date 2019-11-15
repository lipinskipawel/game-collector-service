package com.github.lipinskipawel.game.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/book")
final class RestExample {

    private final BookRepo bookRepo;

    public RestExample(final BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @GetMapping("/title/{text}")
    String hello(@PathVariable final String text) {
        final var save = bookRepo.save(new Book(text, new Random().nextInt(300) + 1));
        return save.getTitle();
    }

    @GetMapping("/all")
    List<Book> all() {
        return bookRepo.findAll();
    }
}
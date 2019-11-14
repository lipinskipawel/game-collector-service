package com.github.lipinskipawel.game.demo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
@NoArgsConstructor
@Getter
@EqualsAndHashCode
final class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private int pages;


    public Book(final String title, final int pages) {
        this.title = title;
        this.pages = pages;
    }
}

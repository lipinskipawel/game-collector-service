package com.github.lipinskipawel.game.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface BookRepo extends JpaRepository<Book, Long> {

    Book findByTitle(String title);
}

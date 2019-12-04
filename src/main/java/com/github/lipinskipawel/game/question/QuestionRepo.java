package com.github.lipinskipawel.game.question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface QuestionRepo extends JpaRepository<QuestionEntity, Long> {
}

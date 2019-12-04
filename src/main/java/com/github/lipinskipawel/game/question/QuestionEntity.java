package com.github.lipinskipawel.game.question;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
final class QuestionEntity {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String question;

    @NonNull
    private String choices;

    @NonNull
    private String answers;

    @NonNull
    private long time;
}

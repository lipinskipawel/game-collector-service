package com.github.lipinskipawel.game.question;

import java.util.Arrays;

import static java.util.Objects.requireNonNull;

final class QuestionTranslator {


    static QuestionEntity from(final Question question) {
        requireNonNull(question);
        return new QuestionEntity(
                null,
                question.getUniqIdentifier(),
                question.getModule(),
                question.getQuestion(),
                String.join(",", question.getChoices()),
                String.join(",", question.getAnswers()),
                question.getTime()
        );
    }

    static Question from(final QuestionEntity entity) {
        requireNonNull(entity);
        return new Question(
                entity.getUniqIdentifier(),
                entity.getModule(),
                entity.getQuestion(),
                Arrays.stream(entity.getChoices().split(",")).map(String::trim).toArray(String[]::new),
                Arrays.stream(entity.getAnswers().split(",")).map(String::trim).toArray(String[]::new),
                entity.getTime()
        );
    }
}

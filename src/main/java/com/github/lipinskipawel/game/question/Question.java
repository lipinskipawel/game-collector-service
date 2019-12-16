package com.github.lipinskipawel.game.question;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * This class is an API.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
public final class Question {

    @NonNull
    private String uniqIdentifier;

    @NonNull
    private String module;

    @NonNull
    private String question;

    @NonNull
    private String[] choices;

    @NonNull
    private String[] answers;

    @NonNull
    private long time;
}

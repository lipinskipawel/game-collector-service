package com.github.lipinskipawel.game.question;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static com.github.lipinskipawel.game.question.QuestionTranslator.from;
import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/question")
final class QuestionResource {

    private final QuestionRepo questionRepo;

    public QuestionResource(final QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    @GetMapping("/all")
    List<Question> all() {
        return questionRepo.findAll()
                .stream()
                .map(QuestionTranslator::from)
                .collect(toList());
    }

    @PostMapping("/save")
    Question saveData(@RequestBody @Valid Question question) {
        final var entity = from(question);
        this.questionRepo.save(entity);
        return from(entity);
    }
}

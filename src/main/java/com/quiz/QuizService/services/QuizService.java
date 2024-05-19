package com.quiz.QuizService.services;

import com.quiz.QuizService.entities.Quiz;

import java.util.List;

public interface QuizService {
    Quiz add(Quiz quiz);
    List<Quiz> getAll();
    Quiz getById(Long id);
}

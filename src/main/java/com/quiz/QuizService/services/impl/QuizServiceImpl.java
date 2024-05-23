package com.quiz.QuizService.services.impl;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.repositories.QuizRepository;
import com.quiz.QuizService.services.QuestionClient;
import com.quiz.QuizService.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuizServiceImpl implements QuizService {
    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private QuestionClient questionClient;


    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAll() {
        List<Quiz> quizes = quizRepository.findAll();
        quizes.forEach(quiz -> quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId())));
        return quizes;
    }

    @Override
    public Quiz getById(Long id) {
Quiz quiz=quizRepository.findById(id).orElse(null);
quiz.setQuestions(questionClient.getQuestionOfQuiz(id));
        return quiz;
    }
}

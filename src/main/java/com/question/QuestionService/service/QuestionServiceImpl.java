package com.question.QuestionService.service;

import com.question.QuestionService.entities.Question;
import com.question.QuestionService.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements QuestionService{
@Autowired
private QuestionRepo questionRepo;

    @Override
    public Question create(Question question) {
        return questionRepo.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepo.findAll();
    }

    @Override
    public Question getQuestion(Long id) {
        return questionRepo.findById(id).orElse(null);
    }

    @Override
    public List<Question>  getByQuestionofQuiz(Long quizId) {
        return questionRepo.findByQuizId(quizId);
    }
}

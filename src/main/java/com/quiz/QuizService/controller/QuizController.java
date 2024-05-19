package com.quiz.QuizService.controller;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    private QuizService quizService;


    @PostMapping
    Quiz createQuiz(@RequestBody  Quiz quiz) {
        return quizService.add(quiz);
    }

@GetMapping
    public List<Quiz> getAll(){
        return quizService.getAll();
    }

    @GetMapping("/{id}")
    public Quiz getById(@PathVariable Long id){
        return quizService.getById(id);
    }

}



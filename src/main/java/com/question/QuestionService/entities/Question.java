package com.question.QuestionService.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id", nullable = false)
    private Long questionId;
    private String question;

}

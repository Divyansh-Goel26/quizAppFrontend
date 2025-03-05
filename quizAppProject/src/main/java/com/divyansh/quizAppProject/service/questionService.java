package com.divyansh.quizAppProject.service;

import com.divyansh.quizAppProject.Entity.QuizQuestions;
import com.divyansh.quizAppProject.repository.questionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class questionService {

    @Autowired
    questionRepo questionRepo;

    public List<QuizQuestions> getAllQuestions(){
        return questionRepo.findAll();
    }


    public List<QuizQuestions> saveQ(List<QuizQuestions> quizQuestions){
        return questionRepo.saveAll(quizQuestions);
    }

    public List<QuizQuestions> selectQuizType(String quizType){
        return questionRepo.findByQuizType(quizType);
    }


}

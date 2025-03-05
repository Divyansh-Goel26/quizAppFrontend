package com.divyansh.quizAppProject.controller;

import com.divyansh.quizAppProject.Entity.QuizQuestions;
import com.divyansh.quizAppProject.service.questionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class questionController {

    @Autowired
    questionService questionService;

    @GetMapping("/Questions")
    public List<QuizQuestions> questions(){
        return questionService.getAllQuestions();
    }

    @PostMapping("/save")
    public List<QuizQuestions> saveQuestion(@RequestBody List<QuizQuestions> quizQuestions){
        return questionService.saveQ(quizQuestions);
    }

   @GetMapping("/quizType/{quizType}")
    public List<QuizQuestions> findByType(@PathVariable String quizType){
       return questionService.selectQuizType(quizType);
   }


}

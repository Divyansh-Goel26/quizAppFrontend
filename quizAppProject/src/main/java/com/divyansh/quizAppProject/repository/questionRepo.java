package com.divyansh.quizAppProject.repository;

import com.divyansh.quizAppProject.Entity.QuizQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface questionRepo extends JpaRepository<QuizQuestions,Long> {
        List<QuizQuestions> findByQuizType(String quizType);
}

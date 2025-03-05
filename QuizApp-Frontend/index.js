function startQuiz(quizType){
    // alert(`Starting ${quizType.charAt(0).toUpperCase() + quizType.slice(1)} Quiz!`);
    
    localStorage.setItem("quizType", quizType);
    alert(`Starting ${quizType.toUpperCase()} Quiz! `)
    
    window.location.href = `quizPage.html`;
    // window.location.href = quizPage.html;
}
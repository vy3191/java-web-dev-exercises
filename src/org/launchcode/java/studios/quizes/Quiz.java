package org.launchcode.java.studios.quizes;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Quiz {
    private int questionTypes = 0;
    private int totalQuestions;
    private int wrongAnswered = 0;
    private int correctAnswered = 0;
    private ArrayList<Question> questions = new ArrayList<>();
    private String answer;
    private String[] answers = {"angular","foreach", "true", "true", "2,4"};

   private Scanner input = new Scanner(System.in);


    public Quiz() {
        questionTypes++;
    }

    public void addQuestion(Question aQuestion) {
        if(!this.questions.contains(aQuestion)) {
            this.questions.add(aQuestion);
        }
        this.totalQuestions++;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public int getWrongAnswered() {
        this.wrongAnswered = this.totalQuestions - this.correctAnswered;
        return this.wrongAnswered;
    }

    public int getCorrectAnswered() {
        return correctAnswered;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    private boolean doesContain(String str) {
        for(int i=0; i < this.answers.length; i++){
             if(str.toLowerCase().equals(answers[i])) {
                 return true;
             }
        }
        return false;
    }

    public void carryOutQuiz() {
        for(Question singleQuestion : questions) {
            System.out.println( singleQuestion.displayQuestion());
            answer = input.nextLine();
            if(doesContain(answer)) {
                correctAnswered++;
                System.out.println("YOUR ANSWER:"+answer.toUpperCase()+" IS CORRECT");
            } else {
                System.out.println("YOUR ANSWER:"+answer.toUpperCase()+" IS NOT CORRECT");
            }

        }
        input.close();
    }
}

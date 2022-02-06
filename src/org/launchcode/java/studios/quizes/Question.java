package org.launchcode.java.studios.quizes;

public abstract class Question {
    private static int nextQuestionNumber=1;
    private int questionNumber;
    private String question;

    public Question(String aQuestion) {
        this();
        this.question = aQuestion;
    }

    public Question() {
        this.questionNumber = this.nextQuestionNumber;
        nextQuestionNumber++;
    }


    public int getQuestionNumber() {
        return this.questionNumber;
    }

    public String getQuestion() {
        return question;
    }

    public String displayQuestion() {
        return getQuestionNumber()+"."+ getQuestion();
    }
}

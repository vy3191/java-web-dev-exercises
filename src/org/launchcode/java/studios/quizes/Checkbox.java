package org.launchcode.java.studios.quizes;

public class Checkbox extends Question {
    String option1;
    String option2;
    String option3;
    String option4;

    public Checkbox(String question, String option1, String option2, String option3, String option4) {
        super(question);
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

    public String getOption1() {
        return this.option1;
    }

    public String getOption2() {
        return this.option2;
    }

    public String getOption3() {
        return this.option3;
    }

    public String getOption4() {
        return this.option4;
    }

    @Override
    public String displayQuestion() {
        return getQuestionNumber()+"."+ getQuestion()+ "\n"+
                "\t"+"1)."+this.getOption1()+"\n"+
                "\t"+"2)."+this.getOption2()+"\n"+
                "\t"+"3)."+this.getOption3()+"\n"+
                "\t"+"4)."+this.getOption4()+"\n";
    }
}

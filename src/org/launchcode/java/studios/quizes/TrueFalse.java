package org.launchcode.java.studios.quizes;

public class TrueFalse extends Question {
    private String isTrue = "True";
    private String isFalse = "False";

    public TrueFalse(String question) {
        super(question);
    }

    public String getIsTrue() {
        return isTrue;
    }

    public String getIsFalse() {
        return isFalse;
    }

    @Override
    public String displayQuestion() {
        return getQuestionNumber()+"."+ getQuestion()+ "\n"+
                "\t"+"a)."+this.getIsTrue()+"\n"+
                "\t"+"b)."+this.getIsFalse()+"\n";
    }
}

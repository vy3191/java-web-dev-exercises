package org.launchcode.java.studios.quizes;

public class MultipleChoice extends Question {
    private String first;
    private String second;
    private String third;
    private String fourth;

    public MultipleChoice(String question, String first, String second, String third, String fourth) {
        super(question);
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public String getThird() {
        return third;
    }

    public String getFourth() {
        return fourth;
    }

    @Override
    public String displayQuestion() {
        return getQuestionNumber()+"."+ getQuestion()+ "\n"+
                "\t"+"a)."+this.getFirst()+"\n"+
                "\t"+"b)."+this.getSecond()+"\n"+
                "\t"+"c)."+this.getThird()+"\n"+
                "\t"+"d)."+this.getFourth()+"\n";

    }
}

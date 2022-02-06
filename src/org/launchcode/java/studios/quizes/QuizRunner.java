package org.launchcode.java.studios.quizes;

public class QuizRunner {
    public static void main(String[] args) {
        // Multiple choice question-1.
        String questionStatement1 = "Which one of the following is a javaScript Framework?";
        String ch1 = "Angular";
        String ch2 = "React";
        String ch3 = "jQuery";
        String ch4 = "Bootstrap";

        // Multiple choice question-2.
        String questionStatement2 = "Which built-in method calls a function for each element in the javaScript array?";
        String c1 = "While";
        String c2 = "for";
        String c3 = "forEach";
        String c4 = "prototype";

        // True or False
        String questionStatement3 = "In an instance method or a constructor, \"this\" is a reference to the current object.";
        String questionStatement4 = "String questionStatement3 = \"In an instance method or a constructor, \\\"this\\\" is a reference to the current object.\"";

        // Checkbox
        String questionStatement5 = "Where could we place the <app-inside-task-list></app-inside-task-list> element to make “inside-task-list works!” appear on the screen? Select ALL options that work."+"\n"+
        "(Choose all that apply. Separate your answers with a comma)";
        String op1 = "Place the element in inner-task-list.component.html.";
        String op2 = "Place the element in app.component.html.";
        String op3 = "Place the element in index.html.";
        String op4 = "Place the element in task-list.component.html.";

        MultipleChoice question1 = new MultipleChoice(questionStatement1, ch1, ch2, ch3, ch4);
        MultipleChoice question2 = new MultipleChoice(questionStatement2, c1, c2, c3, c4);
        TrueFalse question3 = new TrueFalse(questionStatement3);
        TrueFalse question4 = new TrueFalse(questionStatement4);
        Checkbox question5 = new Checkbox(questionStatement5, op1, op2, op3,op4);

        Quiz myQuiz = new Quiz();
        myQuiz.addQuestion(question1);
        myQuiz.addQuestion(question2);
        myQuiz.addQuestion(question3);
        myQuiz.addQuestion(question4);
        myQuiz.addQuestion(question5);

        myQuiz.carryOutQuiz();
        System.out.println("RESULTS:");
        System.out.println("Total Questions: "+ myQuiz.getTotalQuestions());
        System.out.println("Correct Answered: "+ myQuiz.getCorrectAnswered());
        System.out.println("Wrong Answered: "+ myQuiz.getWrongAnswered());

    }
}

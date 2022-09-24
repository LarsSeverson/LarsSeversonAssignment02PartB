package assignment02PartB;/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Quiz.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

/*
 * This is where the Quiz will go.
 * This includes the questions and the outro response
 */
public final class Quiz {
    //
    // Instance Data Fields
    //
    private String questionOutro;
    private String outroFailed;
    private String questionIntro;
    private String question1;
    private String question2;
    private String question3;
    private String question4;
    private String question5;
    private String question6;
    private String questions[];

    private boolean quiz = true;

    private QuestionAnswer theAnswer;
    //
    // Constructors
    //
    public Quiz(String language) {
        switch(language){
            case "ENGLISH"-> populateEnglishQuestions();
            default -> populateAlienQuestions();
        }
        questions = new String[]{
            questionIntro, question1, question2, question3, question4,
                question5, question6
        };
    }

    //
    // Instance Methods
    //
    public void askQuestion(String theQuestion){
        System.out.println(theQuestion);
    }
    public void populateEnglishQuestions(){
        setQuestionIntro("*** FREE TICKETS to SF GIANTS Games *** _ 1 miss allowed _");
        setQuestion1("Which type of class has 'protected' constructors?");
        setQuestion2("What type of method did Java 8 add to 'interface'?");
        setQuestion3("What new keyword did Java 13 add to 'switch' statement?");
        setQuestion4("In Java 15, what keyword pairs with 'sealed'?");
        setQuestion5("Giants in Spanish?");
        setQuestion6("Take me out to the...?");
        setQuestionOutro("*** Congrats! You won FREE TICKETS to SF GIANTS Games ***");
        setOutroFailed("____ Please try again at your graduation ceremony. ____");
    }
    public void populateAlienQuestions(){
        String alien = Language.getTheLanguage().getLanguage();
        setQuestionIntro(alien + alien);
        setQuestion1(alien + alien);
        setQuestion2(alien + alien);
        setQuestion3(alien + alien);
        setQuestion4(alien + alien);
        setQuestion5(alien + alien);
        setQuestion6(alien + alien);
        setQuestionOutro(alien);
        setOutroFailed(alien);
    }
    //
    // Additional Instance Methods
    //
    public String getQuestions(int i) {
        return questions[i];
    }
    public void setQuestion1(String question1) {
        this.question1 = question1;
    }
    public void setQuestion2(String question2) {
        this.question2 = question2;
    }
    public void setQuestionIntro(String questionIntro) {
        this.questionIntro = questionIntro;
    }
    public void setQuestion3(String question3) {
        this.question3 = question3;
    }
    public void setQuestion4(String question4) {
        this.question4 = question4;
    }
    public void setQuestion5(String question5) {
        this.question5 = question5;
    }
    public void setQuestion6(String question6) {
        this.question6 = question6;
    }
    public void setQuestionOutro(String questionOutro) {
        this.questionOutro = questionOutro;
    }
    public String getQuestionOutro() {
        return questionOutro;
    }
    public String getOutroFailed() {
        return outroFailed;
    }
    public void setTheAnswer(QuestionAnswer theAnswer) {
        this.theAnswer = theAnswer;
    }
    public void setOutroFailed(String outroFailed) {
        this.outroFailed = outroFailed;
    }
    //
    // Language
    //
}
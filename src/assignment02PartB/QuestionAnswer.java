package assignment02PartB;/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: QuestionAnswer.java
 * Author: Duc Ta
 * Author: Lars Severson
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.Objects;

/*
 * This is where all the answers and correct answer responses will go
 *
 */

public class QuestionAnswer {
    //
    // Instance Data Fields
    //
    private static String correctResponse;
    private static String incorrectResponse1;
    private static String incorrectResponse2;

    private static final int endOfQuestions = 6;
    private static int count = 0;

    private boolean incorrect = false;
    //
    // Constructors
    //
    public QuestionAnswer(String theAnswer, String correctAnswer) throws Exception{
        String input;
        input = theAnswer.toUpperCase();

        // Add the count for future implementation
        count++;

        // Set responses
        switch (Language.getTheLanguage().getLanguage()){
            case "ENGLISH"-> {
                correctResponse = Club.getShortName() + ": Correct!";
                incorrectResponse1 = Club.getShortName() + ": ____ Please try again at your graduation ceremony. ____";
                incorrectResponse2 = Club.getShortName() + ": Oops...";
            }
            default -> {
                correctResponse = Club.getShortName() + Language.getDefaultAlienSound();
                incorrectResponse1 = correctResponse;
                incorrectResponse2 = correctResponse;

            }
        }

        // Run check
        questionAnswer(theAnswer, correctAnswer);

        // Return check result
        if (incorrect){
            if (Objects.equals(input, "MISSING") && count != endOfQuestions){
                System.out.println(incorrectResponse2);
                return;
            }
            throw new Exception(incorrectResponse1);
        }
        else{
            System.out.println(correctResponse);
        }
    }

    //
    // Static Method
    //
    public void questionAnswer(String inputAnswer, String correctAnswer) {
        if (Objects.equals(inputAnswer, correctAnswer.toUpperCase())){
            incorrect = false;
        }
        else{
            incorrect = true;
        }
    }
    //
    // Instance Method
    //
    public static String getIncorrectResponse1() {
        return incorrectResponse1;
    }
    //
    // Language
    //

    //
    // Override
    //
}
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
    // Static Data Fields
    //
    private static boolean failed = false;
    //
    // Instance Data Fields
    //
    private static String correctResponse;
    private static String incorrectResponse1;

    private boolean incorrect = false;
    //
    // Constructors
    //
    public QuestionAnswer(String theAnswer, String correctAnswer) {

        // Set responses
        switch (Language.getTheLanguage().getLanguage()){
            case "ENGLISH"-> {
                correctResponse = Club.getShortName() + ": Correct!";
                incorrectResponse1 = Club.getShortName() + ": Oops...";
            }
            default -> {
                correctResponse = Club.getShortName() + Language.getDefaultAlienSound().repeat(2);
                incorrectResponse1 = correctResponse;
            }
        }

        // Run check
        questionAnswer(theAnswer.toUpperCase(), correctAnswer);

        // Return check result
        if (incorrect){
            System.out.println((incorrectResponse1));
            failed = true;
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
    public static boolean isFailed() {
        return failed;
    }
    //
    // Language
    //

    //
    // Override
    //
}
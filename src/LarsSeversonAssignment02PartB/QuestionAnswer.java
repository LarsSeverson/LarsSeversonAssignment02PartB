package LarsSeversonAssignment02PartB;/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: QuestionAnswer.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.Objects;

public class QuestionAnswer {
    //
    // Instance Data Fields
    //
    private static String correctResponse;
    private static String incorrectResponse;
    private boolean incorrect = false;
    //
    // Constructors
    //
    public QuestionAnswer(String theAnswer, String correctAnswer) throws Exception{
        switch (Language.getTheLanguage().getLanguage()){
            case "ENGLISH"-> {
                correctResponse = Club.getShortName() + ": Correct!";
                incorrectResponse = Club.getShortName() + ": Incorrect. Better luck next time...";
            }
            default -> {
                correctResponse = Club.getShortName() + Language.getDefaultAlienSound();
                incorrectResponse = correctResponse;
            }
        }

        questionAnswer(theAnswer, correctAnswer);

        if (incorrect){
            throw new Exception(incorrectResponse);
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
    public static String getCorrectResponse() {
        return correctResponse;
    }
    public static String getIncorrectResponse() {
        return incorrectResponse;
    }
//
    // Language
    //

    //
    // Override
    //
}
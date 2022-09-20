package LarsSeversonAssignment02PartB;
/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Color.java
 * @author: Duc Ta
 * @author: Lars Severson
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Color {

    //
    // Static Data Fields
    //
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";

    //
    // Instance Data Fields
    //
    private String colorSequence = Config.getDefaultColorSequences();
    //
    // Constructors
    //
    public Color() {

    }
    //
    // Static Methods
    //

    //
    // Instance Methods
    //
    public String getColorSequences() {
        if (Language.getTheLanguage().getLanguage() == Language.getDefaultAlienSound()){
            colorSequence = Language.getDefaultAlienSound();
        }
        return colorSequence;
    }
    //
    // Language
    //
}
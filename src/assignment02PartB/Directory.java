package assignment02PartB;/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Directory.java
 * Author: Duc Ta
 * Author: Lars Severson
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

/*
 * Receipt info goes in this class I think?
 */
public final class Directory {

    //
    // Static Data Fields
    //

    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public Directory() {

    }

    public String getPath() {
        if (Language.getTheLanguage().getLanguage() == Language.getDefaultAlienSound()){
            return Language.getDefaultAlienSound();
        }
        return "./src/LarsSeversonAssignment02PartB/log/";
    }

    //
    // Static Methods
    //

    //
    // Instance Methods
    //

    //
    // Language
    //

}

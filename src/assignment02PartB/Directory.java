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

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *
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
        return "./src/assignment02PartB/log/";
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

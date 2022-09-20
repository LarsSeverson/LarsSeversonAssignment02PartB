package LarsSeversonAssignment02PartB;/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: OwnerGroup.java
 * Author: Duc Ta
 * Author: Lars Severson
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class OwnerGroup extends Organization{
    //
    // Data fields
    //
    private String ownerName;
    //
    // Constructors
    //
    public OwnerGroup(String language) {
        if (language == Language.getDefaultAlienSound()){
            ownerName = language;
        }
        else{
            ownerName = "San Francisco Baseball Associates LLC";
        }
    }
    //
    // Instance Methods
    //

    public String getOwnerName() {
        return ownerName;
    }

    //
    // Override
    //
    @Override
    public void displayAbout() {

    }

    @Override
    public void displayMission() {

    }

}
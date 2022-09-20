package LarsSeversonAssignment02PartB;/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: University.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class University extends Organization {
    //
    // Static Data Fields
    //
    private static final String language = Language.getTheLanguage().getLanguage();
    //
    // Instance Data Fields
    //
    private String universityName;
    private String mottoInLatin; // shout out latin
    private String mottoInEnglish;
    private String universityType;
    private String universityLocation;
    private String universityAddress;
    private String color1, color2;
    private String nickName;
    private String universityMascot;
    private String universityWebsite;
    private int yearOfEstablishment;

    private String universityNameHeader;
    private String mottoHeaderLatin;
    private String mottoHeaderEnglish;
    private String universityTypeHeader;
    private String establishmentHeader;
    private String locationHeader;
    private String addressHeader;
    private String colorsHeader;
    private String nickNameHeader;
    private String mascotHeader;
    private String websiteHeader;
    //
    // Constructors
    //
    public University(){

    }
    public University(String universityName) {
        switch(language){
            case "ENGLISH"-> {
                populateUniversityEnglish();
                this.universityName = universityName;
            }
            default -> {
                populateUniversityAlien();
                this.universityName = language;
            }
        }
    }

    //
    // Instance Methods
    //
    private void populateUniversityEnglish(){

    }
    private void populateUniversityAlien(){

    }
    public void displayMission(){

    }
    //
    // Additional Methods
    //
    public String getUniversityName(){
        return universityName;
    }
    //
    // Language
    //

    //
    // Override
    //
    @Override
    public void displayAbout(){

    }
}
package LarsSeversonAssignment02PartB;/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Student.java
 * Author: Duc Ta
 * Author: Lars Severson
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Student extends Person {
    //
    // Static Data Fields
    //

    //     Setting this as static because I don't want any Card methods
    //      in Student class to interfere with Person (getCardCount, getRecipientName, etc...).
    private static Card theCard;
    //
    // Instance Data Fields
    //
    private String studentLanguage;
    private String studentGreeting1;

    private String[] studentGreetings;
    //
    // Constructors
    //
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
        theCard = new Card();
        this.studentLanguage = super.getTheirLanguage();
        switch (studentLanguage){
            case "ENGLISH"-> setStudentGreetingsEnglish();
            default -> setStudentGreetingsAlien();
        }
        studentGreetings = new String[] {
            studentGreeting1
        };
    }
    //
    // Instance Methods
    //
    private void setStudentGreetingsEnglish(){
        setPersonHeader(Color.ANSI_PURPLE_BACKGROUND+Color.ANSI_YELLOW+super.getFirstName() + " " + super.getLastName()
             + Color.ANSI_RESET  + ": ");
        setStudentGreeting1("Welcome to my University!");
    }
    private void setStudentGreetingsAlien(){
        setPersonHeader(super.getFirstName() + " " + super.getLastName() + ": ");
        setStudentGreeting1(studentLanguage);
    }
    //
    // Additional Methods
    //
    public void setStudentGreeting1(String studentGreeting1) {
        this.studentGreeting1 = studentGreeting1;
    }
    public static Card getTheCard() {
        return theCard;
    }
    //
    // Language
    //

    //
    // Override
    //
    @Override
    public void sayGreeting(String string) {
        super.sayGreeting(string);
    }
    @Override
    public String getGreetings(int i){
        return studentGreetings[i];
    }
    @Override
    public void setEmail(String email){
        super.setEmail(email);
    }
    @Override
    public void setPersonHeader(String theirHeader){
        super.setPersonHeader(theirHeader);
    }
}
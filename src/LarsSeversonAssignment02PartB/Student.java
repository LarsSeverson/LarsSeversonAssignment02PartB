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
    // Instance Data Fields
    //
    private String studentLanguage;
    private String studentEmail;
    private String studentGreetingHeader;
    private String studentGreeting1;

    private String[] studentGreetings;
    //
    // Constructors
    //
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
        this.studentLanguage = super.getTheirLanguage();
        switch (studentLanguage){
            case "ENGLISH"-> setStudentGreetingsEnglish();
            default -> setStudentGreetingsAlien();
        }
        studentGreetingHeader = firstName + " " + lastName + ": ";
        studentGreetings = new String[] {
            studentGreeting1
        };
    }
    //
    // Instance Methods
    //
    private void setStudentGreetingsEnglish(){
        setStudentGreeting1("Welcome to my University!");
    }
    private void setStudentGreetingsAlien(){
        setStudentGreeting1(studentLanguage);
    }
    //
    // Additional Methods
    //
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    public String getStudentEmail() {
        return studentEmail;
    }

    public String getStudentGreetingHeader() {
        return studentGreetingHeader;
    }

    public void setStudentGreeting1(String studentGreeting1) {
        this.studentGreeting1 = studentGreeting1;
    }

    //
    // Language
    //
    public void sayStudentGreeting(int i){
        sayGreeting(studentGreetings[i]);
    }
    //
    // Override
    //
    @Override
    public void sayGreeting(String string) {
        System.out.print(studentGreetingHeader);
        super.sayGreeting(string);
    }
}
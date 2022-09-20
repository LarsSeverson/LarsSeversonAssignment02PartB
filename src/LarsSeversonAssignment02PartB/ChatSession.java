package LarsSeversonAssignment02PartB;/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: ChatSession.java
 * @author: Duc Ta
 * @author: Lars Severson
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.Scanner;

public final class ChatSession {
    //
    //  Static Data Fields
    //
    private static String start;
    //
    // Instance Data Fields
    //
    private Club theClub;
    private University theUniversity;
    private Student theStudent;
    //
    // Constructors
    //
    public ChatSession() {
    }
    public ChatSession(Club theClub, University theUniversity){
        this.theClub = theClub;
        this.theUniversity = theUniversity;
    }
    //
    // Instance Methods
    //
    public static void displayTimerInformation(){
        System.out.print(Timer.getDateFormat());
    }
    private void startChatSession(String language) {
        // in Alien
        if (language == Language.getDefaultAlienSound()){
            start = language;
            System.out.println(start + "\n");

            theClub.getGreeting(0);
            theClub.displayAbout();

            getAndCheckInput();
            theStudent.sayStudentGreeting(0);
        }
        // in English
        else{
            start = "Chat session started.\n";
            System.out.println(start);

            theClub.getGreeting(0);
            theClub.displayAbout();

            // Please enter first and last name:
            getAndCheckInput();
            // Please enter school email:
            Scanner input = new Scanner(System.in);
            theClub.getGreeting(2);
            theStudent.setStudentEmail(input.nextLine());
            // Student University greeting:
            theStudent.sayStudentGreeting(0);
        }
    }
    private void getAndCheckInput(){
        Scanner input = new Scanner(System.in);
        String theInput;
        String[] elements = null;
        boolean loop = true;
        while(loop){
            theClub.getGreeting(1);
            theInput = input.nextLine();
            elements = theInput.split("\\s");
            if (elements.length == 2){
                loop = false;
            }
            else {
                System.out.println("Input Error.");
            }
        }
        theStudent = new Student(elements[0], elements[1]);
    }
    private void connectChatters() {
    }
    private void chat() {

    }
    private void runQuiz() {
    }
    private void stopChatSession() {
    }
    public void runChatSession() {
        displayTimerInformation();
        startChatSession(Language.getTheLanguage().getLanguage());
    }
    private void displayChatSessionInformation(){
        System.out.println();
    }
    //
    // Additional Instance Methods
    //
    public Club getTheClub() {
        return theClub;
    }
    public void setTheClub(Club theClub) {
        this.theClub = theClub;
    }
    //
    // Language
    //
    private String getClubPhrase(int i){
        return Messenger.getConfig().getLanguage().getClubPhrase(i);
    }
}
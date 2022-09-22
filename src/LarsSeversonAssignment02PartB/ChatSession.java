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

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
    private Person theStudent; // Defined in getAndCheckInput
    private Person thePlayer;
    private Quiz theQuiz;
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
        displayTimerInformation();
        // in Alien
        if (language == Language.getDefaultAlienSound()){
            start = language;
            System.out.println(start + "\n");

            theClub.sayGreeting(0);
            theClub.displayAbout();

            getAndCheckInput();

            Scanner input = new Scanner(System.in);
            theClub.sayGreeting(2);
            theStudent.setEmail(input.nextLine());

            theStudent.sayGreeting(theStudent.getTheirHeader());
            theStudent.sayGreeting(theStudent.getGreetings(0));
            theUniversity.displayAbout();
            theClub.sayGreeting(3);
        }
        // in English
        else{
            start = "Chat session started.\n";
            System.out.println(start);

            theClub.sayGreeting(0);
            theClub.displayAbout();

            // Please enter first and last name:
            getAndCheckInput();
            // Please enter school email:
            Scanner input = new Scanner(System.in);
            theClub.sayGreeting(2);
            theStudent.setEmail(input.nextLine());
            // Student University greeting:
            theStudent.sayGreeting(theStudent.getTheirHeader());
            theStudent.sayGreeting(theStudent.getGreetings(0));
            theUniversity.displayAbout();
            // Greeting then -> connectChatters()
            theClub.sayGreeting(3);
        }
    }
    private void getAndCheckInput(){
        Scanner input = new Scanner(System.in);
        String theInput;
        String[] elements = null;
        boolean loop = true;
        while(loop){
            theClub.sayGreeting(1);
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
        System.out.println();
        try{
            for(int i = 0; i < 4; ++i){
                System.out.print(". ");
                TimeUnit.SECONDS.sleep(1);
            }
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
        this.thePlayer = theClub.getBusterPosey();
        thePlayer.displayPlayerInfo();
        try{
            for(int i = 0; i < 4; ++i){
                System.out.print(". ");
                TimeUnit.SECONDS.sleep(1);
            }
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }

    }
    private void chat() {
        System.out.println();
        thePlayer.sayGreeting(thePlayer.getTheirHeader());
        thePlayer.sayGreeting(thePlayer.getGreetings(0));
        theStudent.sayGreeting(theStudent.getFirstName());
        thePlayer.sayGreeting(thePlayer.getGreetings(1));

        System.out.println();
        thePlayer.sayGreeting(thePlayer.getTheirHeader());
        thePlayer.sayGreeting(thePlayer.getGreetings(2));
        // Sorry if the continuous Scanner objects get confusing, I'm used to C++ where I can
        // just put cin >> so this is how my brain operates for inputs. Not sure if there's a better way.
        Scanner input = new Scanner(System.in);
        System.out.println();
        theStudent.sayGreeting(theStudent.getTheirHeader());
        // Since it doesn't really matter what the student says, just get input for funzies
        input.nextLine();

        thePlayer.sayGreeting(thePlayer.getTheirHeader());
        thePlayer.sayGreeting(thePlayer.getGreetings(3));
        theStudent.sayGreeting(theStudent.getFirstName());
        thePlayer.sayGreeting(thePlayer.getGreetings(4));

        // Get how many cards: - Uses player greeting 5 and 6
        System.out.println();
        getHowManyCards();

        // Get card info: - Uses player greeting 7 and 8
        // (In 3 lines please provide... get student input and make cards
        getCardInfo(Student.getTheCard().getCardCount());

        // Thanks [name], please confirm your order
        thePlayer.sayGreeting(thePlayer.getTheirHeader());
        thePlayer.sayGreeting(thePlayer.getGreetings(9));
        theStudent.sayGreeting(theStudent.getFirstName());
        thePlayer.sayGreeting(thePlayer.getGreetings(10));
        // Print the cards:
        printTheCards();
        // Student confirm:
        theStudent.sayGreeting(theStudent.getTheirHeader());
        input.nextLine();
        // Goodbye Posey ;(
        thePlayer.sayGreeting(thePlayer.getTheirHeader());
        thePlayer.sayGreeting(thePlayer.getGreetings(11));
        theStudent.sayGreeting(theStudent.getFirstName());
        thePlayer.sayGreeting(thePlayer.getGreetings(12));
        System.out.println();
    }
    private void getHowManyCards(){
        Scanner theInput = new Scanner(System.in);
        int count = 3;
        while(count != -1){
            thePlayer.sayGreeting(thePlayer.getTheirHeader());
            thePlayer.sayGreeting(thePlayer.getGreetings(5));
            System.out.println();
            theStudent.sayGreeting(theStudent.getTheirHeader());
            try{
                Student.getTheCard().setCardCount(theInput.nextInt());
                break;
            }
            catch(InputMismatchException e){
                theInput.next();
                System.out.println("Please enter an INTEGER " + count + " tries left.");
                System.out.println(e);
                count--;
            }
        }
    }
    private void getCardInfo(int n){
        thePlayer.sayGreeting(thePlayer.getTheirHeader());
        thePlayer.sayGreeting(thePlayer.getGreetings(6));
        System.out.println();
        for(int i = 1; i <= n; ++i){
            // Get the player questions setup
            thePlayer.sayGreeting(thePlayer.getTheirHeader());
            thePlayer.sayGreeting(thePlayer.getGreetings(7) + i + thePlayer.getGreetings(8));
            // Now get the info
            System.out.println();
            for(int j = 1; j <= 3; ++j){
                theStudent.sayGreeting(theStudent.getTheirHeader() + " [" + j + "] ");
                Scanner input = new Scanner(System.in);
                // Need to separate the inputs and assign them to each variable for Card class
                if (j == 1){
                    Student.getTheCard().setRecipientName(input.nextLine());
                }
                else if (j == 2){
                    Student.getTheCard().setArtSymbol(input.nextLine());
                }
                else{
                    Student.getTheCard().setMessageToRecipient(input.nextLine());
                }
            }
            // This statement adds to the cardArray I made in Card class
            Student.getTheCard().getCardArray().add(new Card(Student.getTheCard().getRecipientName(),
                    Student.getTheCard().getArtSymbol(), Student.getTheCard().getMessageToRecipient(), 12,
                    ""));
        }
    }
    private void printTheCards() {
        try {
            System.out.println();
            int n = Student.getTheCard().getCardArray().size();
            for(int i = 0; i < n; i++){
                // This is a big line of code, refer to my comments for understanding
                // For reference: generateSFGiantsCard(String recipient, String message, String senderFirstName, String senderEmail, char artSymbol, int artSize, String artFont)
                SFGiantsCardGenerator.generateSFGiantsCard
                        (Student.getTheCard().getACard(i).getRecipientName(),               // String recipient
                                Student.getTheCard().getACard(i).getMessageToRecipient(),   // String message
                                theStudent.getFirstName(), theStudent.getTheirEmail(),      // String senderFirstName, String senderEmail
                                Student.getTheCard().getACard(i).getArtSymbol().charAt(0),  // char artSymbol
                                Student.getTheCard().getACard(i).getArtSize(),              // int artSize
                                Student.getTheCard().getACard(i).getArtFont());             // String artFont
                System.out.println();
                // This is going to iterate through the cardArray in Card class based on which int i it's in
                // This could also be an example of a Queue data structure where the first in the array is the first to go out(print)
                // Fun!
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    private void runQuiz() {
        System.out.println();
        String club;
        if (Language.getTheLanguage().getLanguage() == Language.getDefaultAlienSound()){
            club = Club.getShortName();
        }else{
            club = Club.getShortName() + ": ";
        }
        String studentInput = theStudent.getTheirHeader();
        Scanner input = new Scanner(System.in);
        theQuiz = new Quiz(Language.getTheLanguage().getLanguage());
        try{
            // Question 1
            theQuiz.askQuestion(club + theQuiz.getQuestions(0));
            theQuiz.askQuestion(club + theQuiz.getQuestions(1));
            theStudent.sayGreeting(studentInput);
            theQuiz.setTheAnswer(new QuestionAnswer(input.nextLine().toUpperCase(), "abstract"));
            // Question 2
            theQuiz.askQuestion(club + theQuiz.getQuestions(2));
            theStudent.sayGreeting(studentInput);
            theQuiz.setTheAnswer(new QuestionAnswer(input.nextLine().toUpperCase(), "default"));
            // Question 3
            theQuiz.askQuestion(club + theQuiz.getQuestions(3));
            theStudent.sayGreeting(studentInput);
            theQuiz.setTheAnswer(new QuestionAnswer(input.nextLine().toUpperCase(), "yield"));
            // Question 4
            theQuiz.askQuestion(club + theQuiz.getQuestions(4));
            theStudent.sayGreeting(studentInput);
            theQuiz.setTheAnswer(new QuestionAnswer(input.nextLine().toUpperCase(), "permits"));
            // Question 5
            theQuiz.askQuestion(club + theQuiz.getQuestions(5));
            theStudent.sayGreeting(studentInput);
            theQuiz.setTheAnswer(new QuestionAnswer(input.nextLine().toUpperCase(), "Gigantes"));
            // Question 6
            theQuiz.askQuestion(club + theQuiz.getQuestions(6));
            theStudent.sayGreeting(studentInput);
            theQuiz.setTheAnswer(new QuestionAnswer(input.nextLine().toUpperCase(), "Ball Game"));
            // Outro
            System.out.println(theQuiz.getQuestionOutro());
        }
        catch (Exception ex){
            System.out.println(QuestionAnswer.getIncorrectResponse());
        }
    }
    private void stopChatSession() {
        displayTimerInformation();
        if (Objects.equals(Language.getTheLanguage().getLanguage(), "ENGLISH")){
            System.out.println("Chat session ended.");
        }
        else{
            System.out.print(Language.getTheLanguage().getLanguage());
        }
    }
    public void runChatSession() {
        startChatSession(Language.getTheLanguage().getLanguage());
        connectChatters();
        chat();
        runQuiz();
        stopChatSession();
    }
    private void displayChatSessionInformation(){
        System.out.println();
    }
    //
    // Additional Instance Methods
    //

    //
    // Language
    //
}
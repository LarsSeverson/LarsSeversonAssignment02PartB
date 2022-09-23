package assignment02PartB;/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Person.java
 * Author: Duc Ta
 * Author: Lars Severson
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

// JAVA 15, 2020, added "sealed" and "permits" to Java classes.
// We are learning the new elements of JAVA 15.
// "sealed" and "permits" are used here so that we will have one more example to reference.
// We do not need to understand "sealed" and "permits" in order to start and complete this assignment.

/*
 * Whenever I make a person, in this case a gm, manager, player, president, or student,
 * I will refer to this class and polymorphism
 */
public sealed abstract class Person implements Greeting permits GeneralManager, Manager, Player, President, Student {

    //
    // Instance Data Fields
    //
    private String firstName;
    private String lastName;
    private String theirEmail;
    private String theirHeader;

    private String theirLanguage;
    //
    // Constructors
    //
    public Person(){

    }
    public Person(String firstName, String lastName) {
        birth(firstName, lastName);
    }
    //
    // Instance Methods
    //

    // If a person needs a header for the program here's where they'll define it
    public void setPersonHeader(String theirHeader){
        this.theirHeader = theirHeader;
    }

    public void birth(String firstName, String lastName){
        // Making a baby
        setTheirLanguage(Language.getTheLanguage().getLanguage());
        giveName(firstName, lastName);
    }

    public void giveName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getTheirLanguage() {
        return theirLanguage;
    }
    public String getTheirHeader (){
        return this.theirHeader;
    }
    //
    // Additional Methods
    //
    public abstract String getGreetings(int i);
    // Player exclusive
    public void displayPlayerInfo(){

    }
    // Student exclusive, but could also implement abstract because everyone has an email?
    public void setEmail(String theirEmail){
        this.theirEmail = theirEmail;
    }

    public String getTheirEmail() {
        return theirEmail;
    }

    //
    // Language
    //
    public void setTheirLanguage(String theirLanguage) {
        this.theirLanguage = theirLanguage;
    }
    //
    // @override
    //
    @Override
    public void sayGreeting(String string) {
        System.out.print(string);
    }
}
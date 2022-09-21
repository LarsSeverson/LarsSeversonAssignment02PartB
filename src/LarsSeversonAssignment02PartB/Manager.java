package LarsSeversonAssignment02PartB;
/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Manager.java
 * Author: Duc Ta
 * Author: Lars Severson
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

/*
    It makes the most sense to me to have a person say the greetings
    for the club in the program. I've decided to have the manager of
    the club say the greetings to the user of the program. It would be nice
    if there was another class that was defined as ClubReception or something
    like that, which also extends Person. In that case, I would have that class
    display the club greetings, and it would be very similar to this class.
 */

public final class Manager extends Person {
    //
    // Instance Data Fields
    //
    private String greetingFollow;
    private String clubGreeting1;
    private String clubGreeting2;
    private String clubGreeting3;
    private String clubGreeting4;

    private final String[] greetings;
    //
    // Constructors
    //
    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
        populateGreetings(Language.getTheLanguage().getLanguage());
        greetings = new String[] {
                clubGreeting1, clubGreeting2, clubGreeting3
                , clubGreeting4
        };
    }
    //
    // Instance Methods
    //
    private void populateGreetings(String language){
        switch (language){
            case "ENGLISH"-> setEnglishGreetings();
            default -> setAlienGreetings();
        }
    }
    public void setEnglishGreetings(){
        setGreetingFollow(": ");
        setClubGreeting1("Welcome to the " + Config.getDefaultClub().toUpperCase() + "!");
        setClubGreeting2("Your first name and last name, please: ");
        setClubGreeting3("Your school email address, please: ");
        setClubGreeting4("Thank you. We are connecting you with our player...");
    }
    public void setAlienGreetings(){
        setGreetingFollow(super.getTheirLanguage());
        setClubGreeting1(super.getTheirLanguage()+ " "+ super.getTheirLanguage().repeat(2));
        setClubGreeting2(super.getTheirLanguage());
        setClubGreeting3(super.getTheirLanguage());
        setClubGreeting4(super.getTheirLanguage());
    }
    //
    // Additional Methods
    //
    public String getClubGreeting1() {
        return clubGreeting1;
    }
    public void setClubGreeting1(String clubGreeting1) {
        this.clubGreeting1 = clubGreeting1;
    }
    public String getClubGreeting2() {
        return clubGreeting2;
    }
    public void setClubGreeting2(String clubGreeting2) {
        this.clubGreeting2 = clubGreeting2;
    }
    public String getClubGreeting3() {
        return clubGreeting3;
    }
    public void setClubGreeting3(String clubGreeting3) {
        this.clubGreeting3 = clubGreeting3;
    }
    public String getClubGreeting4() {
        return clubGreeting4;
    }
    public void setClubGreeting4(String clubGreeting4) {
        this.clubGreeting4 = clubGreeting4;
    }
    public String getGreetingFollow() {
        return greetingFollow;
    }
    public void setGreetingFollow(String greetingFollow) {
        this.greetingFollow = greetingFollow;
    }
    //
    // Language
    //
    //
    //Override
    //
    @Override
    public void sayGreeting(String string) {
        System.out.print(Club.getShortName() + getGreetingFollow());
        super.sayGreeting(string);
    }
    @Override
    public String getGreetings(int i){
        return greetings[i];
    }
}
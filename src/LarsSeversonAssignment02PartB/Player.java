package LarsSeversonAssignment02PartB;/*
 * **********************************************
 * San Francisco State larsSeversonAssignment02PartB.University
 * CSC 220 -  Data Structures
 * File Name: larsSeversonAssignment02PartB.Player.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Player extends Person {
    //
    // Instance Data Fields
    //
    private String infoHeader;
    private String playerHeader;
    private String clubHeader;
    private String positionHeader;
    private String numberHeader;
    private String batsHeader;
    private String throwsHeader;
    private String debutHeader;

    private String theClub;
    private String playerPosition;
    private int playerNumber;
    private String playerBats;
    private String playerThrows;
    private int MLBDebut;

    private String busterGreeting1Part1, busterGreeting1Part2, busterGreeting2, busterGreeting3Part1,
            busterGreeting3Part2, busterGreeting4, busterGreeting5, busterGreeting6Part1, busterGreeting6Part2,
            busterGreeting7Part1, busterGreeting7Part2;
    private String greetings[];
    //
    // Constructors
    //
    public Player(String firstName, String lastName) {
        super(firstName, lastName);
        switch(super.getTheirLanguage()){
            case "ENGLISH"->setEnglishInfo();
            default -> setAlienInfo();
        }
        greetings = new String[]{
          busterGreeting1Part1, busterGreeting1Part2, busterGreeting2, busterGreeting3Part1,
                busterGreeting3Part2, busterGreeting4, busterGreeting5, busterGreeting6Part1,
                busterGreeting6Part2, busterGreeting7Part1, busterGreeting7Part2
        };
    }
    //
    // Instance Methods
    //
    private void setEnglishInfo(){
        setInfoHeader("-".repeat(70));
        setPlayerHeader("Player:");
        setClubHeader("Club:");
        setPositionHeader("Position:");
        setNumberHeader("Number:");
        setBatsHeader("Bats:");
        setThrowsHeader("Throws");
        setDebutHeader("MLB Debut:");

        setTheClub(Config.getDefaultClub());
        setPlayerPosition("Catcher");
        setPlayerNumber(28);
        setPlayerBats("Right");
        setPlayerThrows("Right");
        setMLBDebut(2009);

        setPersonHeader(super.getFirstName() + " " + super.getLastName()
                + ", " + getPlayerNumber() + ": ");
        setBusterGreeting1Part1("Hello ");
        setBusterGreeting1Part2(". C-O-N-G-R-A-T-U-L-A-T-I-O-N-S!");
        setBusterGreeting2(Config.getDefaultUniversity().toUpperCase() + ". " + "Way to go!");
        setBusterGreeting3Part1("Likewise, ");
        setBusterGreeting3Part2(". Very nice chatting w/ you.");
        setBusterGreeting4("How many SF Giants Thank You cards would you like to order?");
        setBusterGreeting5("In 3 lines, please provide\n" +
                "\t[1] Recipient name\n" +
                "\t[2] Art symbol (a character)\n" +
                "\t[3] Message to recipient");
        setBusterGreeting6Part1("Card #");
        setBusterGreeting6Part2(":");
        setBusterGreeting7Part1("Thanks, ");
        setBusterGreeting7Part2(". Please confirm your order:");
    }

    private void setAlienInfo(){
        String alien = super.getTheirLanguage();
        setInfoHeader(alien);
        setPlayerHeader(alien);
        setClubHeader(alien);
        setPositionHeader(alien);
        setNumberHeader(alien);
        setBatsHeader(alien);
        setThrowsHeader(alien);
        setDebutHeader(alien);

        setTheClub(alien);
        setPlayerPosition(alien);
        setPlayerNumber(28);
        setPlayerBats(alien);
        setPlayerThrows(alien);
        setMLBDebut(2009);

        setPersonHeader(super.getFirstName() + " " + super.getLastName()
                + ", " + getPlayerNumber() + ": ");
        setBusterGreeting1Part1(alien);
        setBusterGreeting1Part2(alien);
        setBusterGreeting2(". " + alien);
        setBusterGreeting3Part1(alien);
        setBusterGreeting3Part2(alien);
        setBusterGreeting4(alien);
        setBusterGreeting5(alien);
        setBusterGreeting6Part1(alien);
        setBusterGreeting6Part2(alien);
        setBusterGreeting7Part1(alien + " " + alien);
        setBusterGreeting7Part2(alien);
    }
    //
    // Additional Instance Methods
    //
    public void setInfoHeader(String infoHeader) {
        this.infoHeader = infoHeader;
    }
    public String getPlayerHeader() {
        return playerHeader;
    }
    public void setPlayerHeader(String playerHeader) {
        this.playerHeader = playerHeader;
    }
    public String getClubHeader() {
        return clubHeader;
    }
    public void setClubHeader(String clubHeader) {
        this.clubHeader = clubHeader;
    }
    public String getPositionHeader() {
        return positionHeader;
    }
    public void setPositionHeader(String positionHeader) {
        this.positionHeader = positionHeader;
    }
    public String getNumberHeader() {
        return numberHeader;
    }
    public void setNumberHeader(String numberHeader) {
        this.numberHeader = numberHeader;
    }
    public String getBatsHeader() {
        return batsHeader;
    }
    public void setBatsHeader(String batsHeader) {
        this.batsHeader = batsHeader;
    }
    public String getThrowsHeader() {
        return throwsHeader;
    }
    public void setThrowsHeader(String throwsHeader) {
        this.throwsHeader = throwsHeader;
    }
    public String getDebutHeader() {
        return debutHeader;
    }
    public void setDebutHeader(String debutHeader) {
        this.debutHeader = debutHeader;
    }
    public String getTheClub() {
        return theClub;
    }
    public void setTheClub(String theClub) {
        this.theClub = theClub;
    }
    public String getPlayerPosition() {
        return playerPosition;
    }
    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }
    public int getPlayerNumber() {
        return playerNumber;
    }
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
    public String getPlayerBats() {
        return playerBats;
    }
    public void setPlayerBats(String playerBats) {
        this.playerBats = playerBats;
    }
    public String getPlayerThrows() {
        return playerThrows;
    }
    public void setPlayerThrows(String playerThrows) {
        this.playerThrows = playerThrows;
    }
    public int getMLBDebut() {
        return MLBDebut;
    }
    public void setMLBDebut(int MLBDebut) {
        this.MLBDebut = MLBDebut;
    }
    private void setBusterGreeting1Part1(String busterGreeting1Part1) {
        this.busterGreeting1Part1 = busterGreeting1Part1;
    }
    public void setBusterGreeting1Part2(String busterGreeting1Part2) {
        this.busterGreeting1Part2 = busterGreeting1Part2;
    }
    public void setBusterGreeting2(String busterGreeting2) {
        this.busterGreeting2 = busterGreeting2;
    }
    public void setBusterGreeting3Part1(String busterGreeting3Part1) {
        this.busterGreeting3Part1 = busterGreeting3Part1;
    }
    public void setBusterGreeting3Part2(String busterGreeting3Part2) {
        this.busterGreeting3Part2 = busterGreeting3Part2;
    }
    public void setBusterGreeting4(String busterGreeting4) {
        this.busterGreeting4 = busterGreeting4;
    }
    public void setBusterGreeting5(String busterGreeting5) {
        this.busterGreeting5 = busterGreeting5;
    }
    public void setBusterGreeting6Part1(String busterGreeting6Part1) {
        this.busterGreeting6Part1 = busterGreeting6Part1;
    }
    public void setBusterGreeting6Part2(String busterGreeting6Part2) {
        this.busterGreeting6Part2 = busterGreeting6Part2;
    }
    public void setBusterGreeting7Part1(String busterGreeting7Part1) {
        this.busterGreeting7Part1 = busterGreeting7Part1;
    }
    public void setBusterGreeting7Part2(String busterGreeting7Part2) {
        this.busterGreeting7Part2 = busterGreeting7Part2;
    }

    //
    // @Override
    //
    @Override
    public String getGreetings(int i) {
        return greetings[i];
    }
    @Override
    public void sayGreeting(String string) {
        super.sayGreeting(string);
    }
    // Player specific
    @Override
    public void displayPlayerInfo(){
        System.out.println();
        System.out.println(infoHeader);
        System.out.printf("%-25s %-50s %n", this.getPlayerHeader(),
                super.getFirstName()+" "+ super.getLastName());
        System.out.printf("%-25s %-50s %n", this.getClubHeader(), getTheClub());
        System.out.printf("%-25s %-50s %n", this.getPositionHeader(),getPlayerPosition());
        System.out.printf("%-25s %-50s %n", this.getNumberHeader(), getPlayerNumber());
        System.out.printf("%-25s %-50s %n", this.getBatsHeader(), getPlayerBats());
        System.out.printf("%-25s %-50s %n", this.getThrowsHeader(), getPlayerThrows());
        System.out.printf("%-25s %-50s %n", this.getDebutHeader(), getMLBDebut());
        System.out.println(infoHeader);
    }
}

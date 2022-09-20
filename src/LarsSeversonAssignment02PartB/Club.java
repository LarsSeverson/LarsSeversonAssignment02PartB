package LarsSeversonAssignment02PartB;/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Club.java
 * @author: Duc Ta
 * @author: Lars Severson
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Club extends Organization {
    //
    // Instance Data Fields
    //
    private FrontOffice theOffice;
    String language = Language.getTheLanguage().getLanguage();

    private String clubName;
    private String ballPark;
    private String color1,color2,color3,color4;

    private String infoHeader;
    private String clubNameHeader;
    private String shortNameHeader;
    private String ballParkHeader;
    private String colorsHeader;
    private String ownersHeader;
    private String presidentHeader;
    private String generalManagerHeader;
    private String managerHeader;

    private int establishDate;
    private int worldSeriesTitles;
    private int nlPennants;
    private int divisionTitles;
    private int wildCardBerths;

    private String establishDateHeader;
    private String worldSeriesTitlesHeader;
    private String nlPennantsHeader;
    private String divisionsHeader;
    private String wildCardHeader;

    //
    // Static Data Fields
    //
    private static Object[] clubInfo;
    private static String shortName;
    //
    // Constructors
    //
    public Club() {

    }
    public Club(String defClub){
        theOffice = new FrontOffice(language);
        switch(language){
            case "ENGLISH" -> populateClubInfoEnglish(defClub);
            case "SPANISH" -> populateClubInfoSpanish(defClub);
            case "FUTURE" -> populateClubInfoFuture(defClub);
            case "CHINESE" -> populateClubInfoChinese(defClub);
            case "FRENCH" -> populateClubInfoFrench(defClub);
            default -> populateClubInfoALien(Language.getDefaultAlienSound());
        }

        clubInfo = new Object[]{
            clubName, shortName, establishDate, color1, color2,
                color3, color4, ballPark, worldSeriesTitles,
                nlPennants, divisionTitles, wildCardBerths,
        };
    }
    //
    // Static Methods
    //
    public static String getOfficialSong() {
        return null;
    }
    public static String getClubMessage(int i){
        return null;
    }
    public static Object getClubInfo(int i){
        return clubInfo[i];
    }
    //
    // Instance Methods
    //
    public void populateClubInfoEnglish(String clubName){
        setClubName(clubName);
        setShortName("SF Giants");
        setEstablishDate(1883);
        setColor1("Orange");
        setColor2("Black");
        setColor3("Gold");
        setColor4("Cream");
        setBallPark("Oracle Park");
        setWorldSeriesTitles(8);
        setNlPennants(23);
        setDivisionTitles(8);
        setWildCardBerths(3);

        setInfoHeader("-".repeat(70));
        setClubNameHeader("Club:");
        setShortNameHeader("Short Name:");
        setEstablishDateHeader("Established in:");
        setColorsHeader("Colors:");
        setBallParkHeader("Ballpark:");
        setWorldSeriesTitlesHeader("World Series Titles:");
        setNlPennantsHeader("NL Pennants:");
        setDivisionsHeader("Division Titles:");
        setWildCardHeader("Wild Card Berths:");
        setOwnersHeader("Owners:");
        setPresidentHeader("President:");
        setGeneralManagerHeader("General Manager:");
        setManagerHeader("Manager:");
    }
    private void populateClubInfoALien(String defaultAlienSound) {
        setClubName(defaultAlienSound);
        setShortName(defaultAlienSound);
        setEstablishDate(1883);
        setColor1(defaultAlienSound);
        setColor2(defaultAlienSound);
        setColor3(defaultAlienSound);
        setColor4(defaultAlienSound);
        setBallPark(defaultAlienSound);
        setWorldSeriesTitles(8);
        setNlPennants(23);
        setDivisionTitles(8);
        setWildCardBerths(3);

        setInfoHeader(defaultAlienSound);
        setClubNameHeader(defaultAlienSound);
        setShortNameHeader(defaultAlienSound);
        setEstablishDateHeader(defaultAlienSound);
        setColorsHeader(defaultAlienSound);
        setBallParkHeader(defaultAlienSound);
        setWorldSeriesTitlesHeader(defaultAlienSound);
        setNlPennantsHeader(defaultAlienSound);
        setDivisionsHeader(defaultAlienSound);
        setWildCardHeader(defaultAlienSound);
        setOwnersHeader(defaultAlienSound);
        setPresidentHeader(defaultAlienSound);
        setGeneralManagerHeader(defaultAlienSound);
        setManagerHeader(defaultAlienSound);
    }
    private void populateClubInfoFrench(String defClub) {
    }
    private void populateClubInfoChinese(String defClub) {
    }
    private void populateClubInfoFuture(String defClub) {
    }
    private void populateClubInfoSpanish(String defClub) {
    }
    public void displayAbout() {
        System.out.println();
        System.out.println(getInfoHeader());
        System.out.printf("%-25s %-50s %n", this.getClubNameHeader(), getClubInfo(0));
        System.out.printf("%-25s %-50s %n", this.getShortNameHeader(), getClubInfo(1));
        System.out.printf("%-25s %-50s %n", this.getEstablishDateHeader(), getClubInfo(2));
        System.out.printf("%-25s %-50s %n",
                this.getColorsHeader(), getClubInfo(3) +  ", " + getClubInfo(4) + ", " +
                getClubInfo(5) + ", " + getClubInfo(6));
        System.out.printf("%-25s %-50s %n", this.getBallParkHeader(), getClubInfo(7));
        System.out.printf("%-25s %-50s %n", this.getWorldSeriesTitlesHeader(), getClubInfo(8));
        System.out.printf("%-25s %-50s %n", this.getNlPennantsHeader(), getClubInfo(9));
        System.out.printf("%-25s %-50s %n", this.getDivisionsHeader(), getClubInfo(10));
        System.out.printf("%-25s %-50s %n", this.getWildCardHeader(), getClubInfo(11));
        System.out.printf("%-25s %-50s %n", this.getOwnersHeader(), theOffice.getTheOwnerGroup().getOwnerName());
        System.out.printf("%-25s %-50s %n", this.getPresidentHeader(),
                theOffice.getThePresident().getFirstName() + " " + theOffice.getThePresident().getLastName());
        System.out.printf("%-25s %-50s %n", this.getGeneralManagerHeader(),
                theOffice.getTheGeneralManager().getFirstName() + " " + theOffice.getTheGeneralManager().getLastName());
        System.out.printf("%-25s %-50s %n", this.getManagerHeader(),
                theOffice.getManager().getFirstName() + " " + theOffice.getManager().getLastName());
        System.out.println(getInfoHeader());
    }
    public void displayMission() {

    }
    //
    // Additional Instance Methods
    //
    public String getClubName() {
        return clubName;
    }
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
    public static String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    public int getEstablishDate() {
        return establishDate;
    }
    public void setEstablishDate(int establishDate) {
        this.establishDate = establishDate;
    }
    public String getBallPark() {
        return ballPark;
    }
    public void setBallPark(String ballPark) {
        this.ballPark = ballPark;
    }
    public String getColor1() {
        return color1;
    }
    public void setColor1(String color1) {
        this.color1 = color1;
    }
    public String getColor2() {
        return color2;
    }
    public void setColor2(String color2) {
        this.color2 = color2;
    }
    public String getColor3() {
        return color3;
    }
    public void setColor3(String color3) {
        this.color3 = color3;
    }
    public String getColor4() {
        return color4;
    }
    public void setColor4(String color4) {
        this.color4 = color4;
    }
    public int getWorldSeriesTitles() {
        return worldSeriesTitles;
    }
    public void setWorldSeriesTitles(int worldSeriesTitles) {
        this.worldSeriesTitles = worldSeriesTitles;
    }
    public int getNlPennants() {
        return nlPennants;
    }
    public void setNlPennants(int nlPennants) {
        this.nlPennants = nlPennants;
    }
    public int getDivisionTitles() {
        return divisionTitles;
    }
    public void setDivisionTitles(int divisionTitles) {
        this.divisionTitles = divisionTitles;
    }
    public int getWildCardBerths() {
        return wildCardBerths;
    }
    public void setWildCardBerths(int wildCardBerths) {
        this.wildCardBerths = wildCardBerths;
    }
    public FrontOffice getTheOffice() {
        return theOffice;
    }
    public void setTheOffice(FrontOffice theOffice) {
        this.theOffice = theOffice;
    }

    public String getInfoHeader() {
        return infoHeader;
    }
    public void setInfoHeader(String infoHeader) {
        this.infoHeader = infoHeader;
    }
    public String getClubNameHeader() {
        return clubNameHeader;
    }
    public void setClubNameHeader(String clubNameHeader) {
        this.clubNameHeader = clubNameHeader;
    }
    public String getShortNameHeader() {
        return shortNameHeader;
    }
    public void setShortNameHeader(String shortNameHeader) {
        this.shortNameHeader = shortNameHeader;
    }
    public String getBallParkHeader() {
        return ballParkHeader;
    }
    public void setBallParkHeader(String ballParkHeader) {
        this.ballParkHeader = ballParkHeader;
    }
    public String getColorsHeader() {
        return colorsHeader;
    }
    public void setColorsHeader(String colorsHeader) {
        this.colorsHeader = colorsHeader;
    }
    public String getOwnersHeader() {
        return ownersHeader;
    }
    public void setOwnersHeader(String ownersHeader) {
        this.ownersHeader = ownersHeader;
    }
    public String getPresidentHeader() {
        return presidentHeader;
    }
    public void setPresidentHeader(String presidentHeader) {
        this.presidentHeader = presidentHeader;
    }
    public String getGeneralManagerHeader() {
        return generalManagerHeader;
    }
    public void setGeneralManagerHeader(String generalManagerHeader) {
        this.generalManagerHeader = generalManagerHeader;
    }
    public String getManagerHeader() {
        return managerHeader;
    }
    public void setManagerHeader(String managerHeader) {
        this.managerHeader = managerHeader;
    }
    public String getEstablishDateHeader() {
        return establishDateHeader;
    }
    public void setEstablishDateHeader(String establishDateHeader) {
        this.establishDateHeader = establishDateHeader;
    }
    public String getWorldSeriesTitlesHeader() {
        return worldSeriesTitlesHeader;
    }
    public void setWorldSeriesTitlesHeader(String worldSeriesTitlesHeader) {
        this.worldSeriesTitlesHeader = worldSeriesTitlesHeader;
    }
    public String getNlPennantsHeader() {
        return nlPennantsHeader;
    }
    public void setNlPennantsHeader(String nlPennantsHeader) {
        this.nlPennantsHeader = nlPennantsHeader;
    }
    public String getDivisionsHeader() {
        return divisionsHeader;
    }
    public void setDivisionsHeader(String divisionsHeader) {
        this.divisionsHeader = divisionsHeader;
    }
    public String getWildCardHeader() {
        return wildCardHeader;
    }
    public void setWildCardHeader(String wildCardHeader) {
        this.wildCardHeader = wildCardHeader;
    }
    //
    // Language
    //
    public void getGreeting(int i ){
        theOffice.getGreeting(i);
    }
}
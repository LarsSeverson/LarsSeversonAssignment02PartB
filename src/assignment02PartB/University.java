package assignment02PartB;/*
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
    private static String infoHeader;
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
    // Static Methods
    //

    //
    // Instance Methods
    //
    private void populateUniversityEnglish(){
        setUniversityName("San Francisco State University");
        setMottoInLatin("Experientia Docet");
        setMottoInEnglish("Experience Teaches");
        setUniversityType("Public");
        setYearOfEstablishment(1899);
        setUniversityLocation("San Francisco, California, United States");
        setUniversityAddress("1600 Holloway Avenue, San Francisco, CA 94132");
        setColor1("Purple");
        setColor2("Gold");
        setNickName("Gators");
        setUniversityMascot("Gator");
        setUniversityWebsite("www.sfsu.edu");

        setInfoHeader("-".repeat(70));
        setUniversityNameHeader("Official name:");
        setMottoHeaderLatin("Motto in Latin:");
        setMottoHeaderEnglish("Motto in English");
        setUniversityTypeHeader("Type:");
        setEstablishmentHeader("Year of Establishment:");
        setLocationHeader("Location:");
        setAddressHeader("Address:");
        setColorsHeader("Colors");
        setNickNameHeader("Nickname:");
        setMascotHeader("Mascot:");
        setWebsiteHeader("Website:");
    }
    private void populateUniversityAlien(){
        setUniversityName(language);
        setMottoInLatin(language);
        setMottoInEnglish(language);
        setUniversityType(language);
        setYearOfEstablishment(1899);
        setUniversityLocation(language);
        setUniversityAddress(language);
        setColor1(language);
        setColor2(language);
        setNickName(language);
        setUniversityMascot(language);
        setUniversityWebsite(language);

        setInfoHeader(language);
        setUniversityNameHeader(language);
        setMottoHeaderLatin(language);
        setMottoHeaderEnglish(language);
        setUniversityTypeHeader(language);
        setEstablishmentHeader(language);
        setLocationHeader(language);
        setAddressHeader(language);
        setColorsHeader(language);
        setNickNameHeader(language);
        setMascotHeader(language);
        setWebsiteHeader(language);
    }
    //
    // Additional Methods
    //
    public String getUniversityName(){
        return universityName;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    public String getMottoInLatin() {
        return mottoInLatin;
    }
    public void setMottoInLatin(String mottoInLatin) {
        this.mottoInLatin = mottoInLatin;
    }
    public String getMottoInEnglish() {
        return mottoInEnglish;
    }
    public void setMottoInEnglish(String mottoInEnglish) {
        this.mottoInEnglish = mottoInEnglish;
    }
    public String getUniversityType() {
        return universityType;
    }
    public void setUniversityType(String universityType) {
        this.universityType = universityType;
    }
    public String getUniversityLocation() {
        return universityLocation;
    }
    public void setUniversityLocation(String universityLocation) {
        this.universityLocation = universityLocation;
    }
    public String getUniversityAddress() {
        return universityAddress;
    }
    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
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
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getUniversityMascot() {
        return universityMascot;
    }
    public void setUniversityMascot(String universityMascot) {
        this.universityMascot = universityMascot;
    }
    public String getUniversityWebsite() {
        return universityWebsite;
    }
    public void setUniversityWebsite(String universityWebsite) {
        this.universityWebsite = universityWebsite;
    }
    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }
    public void setYearOfEstablishment(int yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }
    public String getUniversityNameHeader() {
        return universityNameHeader;
    }
    public void setUniversityNameHeader(String universityNameHeader) {
        this.universityNameHeader = universityNameHeader;
    }
    public String getMottoHeaderLatin() {
        return mottoHeaderLatin;
    }
    public void setMottoHeaderLatin(String mottoHeaderLatin) {
        this.mottoHeaderLatin = mottoHeaderLatin;
    }
    public String getMottoHeaderEnglish() {
        return mottoHeaderEnglish;
    }
    public void setMottoHeaderEnglish(String mottoHeaderEnglish) {
        this.mottoHeaderEnglish = mottoHeaderEnglish;
    }
    public String getUniversityTypeHeader() {
        return universityTypeHeader;
    }
    public void setUniversityTypeHeader(String universityTypeHeader) {
        this.universityTypeHeader = universityTypeHeader;
    }
    public String getEstablishmentHeader() {
        return establishmentHeader;
    }
    public void setEstablishmentHeader(String establishmentHeader) {
        this.establishmentHeader = establishmentHeader;
    }
    public String getLocationHeader() {
        return locationHeader;
    }
    public void setLocationHeader(String locationHeader) {
        this.locationHeader = locationHeader;
    }
    public String getAddressHeader() {
        return addressHeader;
    }
    public void setAddressHeader(String addressHeader) {
        this.addressHeader = addressHeader;
    }
    public String getColorsHeader() {
        return colorsHeader;
    }
    public void setColorsHeader(String colorsHeader) {
        this.colorsHeader = colorsHeader;
    }
    public String getNickNameHeader() {
        return nickNameHeader;
    }
    public void setNickNameHeader(String nickNameHeader) {
        this.nickNameHeader = nickNameHeader;
    }
    public String getMascotHeader() {
        return mascotHeader;
    }
    public void setMascotHeader(String mascotHeader) {
        this.mascotHeader = mascotHeader;
    }
    public String getWebsiteHeader() {
        return websiteHeader;
    }
    public void setWebsiteHeader(String websiteHeader) {
        this.websiteHeader = websiteHeader;
    }
    public void setInfoHeader(String infoHeader) {
        this.infoHeader = infoHeader;
    }
    //
    // Language
    //

    //
    // Override
    //
    @Override
    public void displayMission(){
    }
    @Override
    public void displayAbout() {
        System.out.println();
        System.out.println(infoHeader);
        System.out.printf("%-25s %-50s %n", this.getUniversityNameHeader(), getUniversityName());
        System.out.printf("%-25s %-50s %n", this.getMottoHeaderLatin(), getMottoInLatin());
        System.out.printf("%-25s %-50s %n", this.getMottoHeaderEnglish(), getMottoInEnglish());
        System.out.printf("%-25s %-50s %n", this.getUniversityTypeHeader(), getUniversityType());
        System.out.printf("%-25s %-50s %n", this.getEstablishmentHeader(), getYearOfEstablishment());
        System.out.printf("%-25s %-50s %n", this.getLocationHeader(), getUniversityLocation());
        System.out.printf("%-25s %-50s %n", this.getAddressHeader(), getUniversityAddress());
        System.out.printf("%-25s %-50s %n", this.getColorsHeader(), getColor1() +  ", " + getColor2());
        System.out.printf("%-25s %-50s %n", this.getNickNameHeader(), getNickName());
        System.out.printf("%-25s %-50s %n", this.getMascotHeader(), getUniversityMascot());
        System.out.printf("%-25s %-50s %n", this.getWebsiteHeader(), getUniversityWebsite());
        System.out.println(infoHeader);
    }
}
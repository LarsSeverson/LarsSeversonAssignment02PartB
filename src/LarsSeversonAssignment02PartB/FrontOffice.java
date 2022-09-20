package LarsSeversonAssignment02PartB;/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: FrontOffice.java
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
public final class FrontOffice {
    //
    // Instance Data Fields
    //
    private President thePresident;
    private GeneralManager theGeneralManager;
    private Manager theManager;
    private OwnerGroup theOwnerGroup;
    //
    // Constructors
    //
    public FrontOffice(String language) {
        setThePresident(language);
        setTheGeneralManager(language);
        setTheManager(language);
        this.theOwnerGroup = new OwnerGroup(Language.getTheLanguage().getLanguage());
    }
    //
    // Instance Methods
    //
    public President getThePresident() {
        return thePresident;
    }
    public GeneralManager getTheGeneralManager() {
        return theGeneralManager;
    }
    public Manager getManager() {
        return theManager;
    }
    public OwnerGroup getTheOwnerGroup() {
        return theOwnerGroup;
    }

    private void setTheManager(String language){
        if (language == Language.getDefaultAlienSound()){
            theManager = new Manager(language, language);
        }
        else{
            theManager = new Manager("Gabe", "Kapler");
        }
    }
    private void setTheGeneralManager(String language){
        if (language == Language.getDefaultAlienSound()){
            theGeneralManager = new GeneralManager(language, language);
        }
        else{
            theGeneralManager = new GeneralManager("Scott", "Harris");
        }
    }
    public void setThePresident(String language) {
        if (language == Language.getDefaultAlienSound()){
            thePresident = new President(language, language);
        }
        else{
            thePresident = new President("Farhan", "Zaidi");
        }
    }
    //
    // Language
    //
    public void getGreeting(int i){
        theManager.sayGreeting(theManager.getGreetings(i));
    }
}
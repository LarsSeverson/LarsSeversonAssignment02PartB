package assignment02PartB;/*
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

/*
 * FrontOffice contains president, manager, gm, and owner group
 * The front office does the greeting, but a person needs to do the
 * greeting, so the manager will be the one greeting
 */
public final class FrontOffice {
    //
    // Instance Data Fields
    //
    private Person thePresident;
    private Person theGeneralManager;
    private Person theManager;
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
    public Person getThePresident() {
        return thePresident;
    }
    public Person getTheGeneralManager() {
        return theGeneralManager;
    }
    public Person getManager() {
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
    public void sayGreeting(int i){
        theManager.sayGreeting(theManager.getGreetings(i));
    }
}
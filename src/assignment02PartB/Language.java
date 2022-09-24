package assignment02PartB;
/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Language.java
 * @author: Duc Ta
 * @author: Lars Severson
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

// java.util.ResourceBundle
// - ResourceBundle is a valid approach to internationalization.
// - ResourceBundle is not required.
// - Other approaches to internationalization are available. Some of these approaches are
// more straightforward and more relevant to new CSC 220 students then ResourceBundle is.
// - Yet, curiosity for intelligence is always highly encouraged:
// https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/ResourceBundle.html

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
 * Holds all the language operations. I started out in this class
 * so apologies if it's a little messy
 */
public final class Language {
    //
    // Static Data Fields
    //
    private static Language theLanguage;
    private static final String defaultAlienSound = "~ ąļīæń ~ "; // Default
    private static final List<String> languageList = new ArrayList<>(Arrays.asList("english", "chinese", "french", "spanish", "future", "alien"));

    private static String phraseHeader;
    private static String languageHead;
    private static String timerHead;
    private static String colorHead;
    private static String standardOutputLogHead;
    private static String standardErrorLogHead;
    private static String receiptLogHead;
    private static String defaultUniversityHead;
    private static String defaultClubHead;
    private static String receiptLog;
    private static String[] phrases;
    //
    // Instance Data Fields
    //
    private String LANGUAGE;
    //
    // Constructors
    //
    public Language() {
    }
    public Language(String language) {
        switch (language.toLowerCase()) {
            case "alien" -> this.populateAlienPhrases();            // Supported
            case "chinese" -> this.populateChinesePhrases();        // Future implementation
            case "french" -> this.populateFrenchPhrases();          // Future implementation
            case "spanish" -> this.populateSpanishPhrases();        // Future implementation
            case "future" -> this.populateYourLanguagePhrases();    // Future implementation
            default -> this.populateEnglishPhrases();               // Supported
        }
        // Now define the array for getPhrases
        phrases = new String[] {
                phraseHeader, languageHead, timerHead, colorHead,
                standardOutputLogHead, standardErrorLogHead,
                receiptLogHead, receiptLog, defaultUniversityHead, defaultClubHead
        };
    }
    //
    // Static Methods
    //
    public static Language setLanguagePreference(){
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        while (loop){
            System.out.print("Language: ");
            String s = input.nextLine().toUpperCase();
            switch (s){
                case "ENGLISH", "SPANISH", "FUTURE", "ALIEN", "FRENCH", "CHINESE" -> {
                    theLanguage = new Language(s);
                    loop = false;
                }
                default -> {
                    // Separates the string with respect to the spaces and commas in between, then puts them into a String list
                    String[] items = s.toLowerCase().split("\\s*,\\s*");
                    for(String i : items){
                        if (!languageList.contains(i)){
                            System.out.println("UNSUPPORTED language. Please enter your language.");
                            break;
                        }
                    }
                }
            }
        }
        return theLanguage;
    }
    //
    // Additional Static Methods
    //
    public static void setPhraseHeader(String phraseHeader) {
        Language.phraseHeader = phraseHeader;
    }
    public static void setLanguageHead(String languageHead) {
        Language.languageHead = languageHead;
    }
    public static void setTimerHead(String timerHead) {
        Language.timerHead = timerHead;
    }
    public static void setColorHead(String colorHead) {
        Language.colorHead = colorHead;
    }
    public static void setStandardOutputLogHead(String standardOutputLogHead) {
        Language.standardOutputLogHead = standardOutputLogHead;
    }
    public static void setStandardErrorLogHead(String standardErrorLogHead) {
        Language.standardErrorLogHead = standardErrorLogHead;
    }
    public static void setReceiptLogHead(String receiptLogHead) {
        Language.receiptLogHead = receiptLogHead;
    }
    public static void setDefaultUniversityHead(String defaultUniversityHead) {
        Language.defaultUniversityHead = defaultUniversityHead;
    }
    public static void setDefaultClubHead(String defaultClubHead) {
        Language.defaultClubHead = defaultClubHead;
    }
    public static void displayAppHeader(){
        System.out.println(Config.getOfficialAppHeader());
    }
    public static void setReceiptLog(String receiptLog) {
        Language.receiptLog = receiptLog;
    }
    public static String getDefaultAlienSound(){ return defaultAlienSound;}
    public static Language getTheLanguage() {
        return theLanguage;
    }

    //
    // Instance Methods
    //
    public void populateAlienPhrases(){
        setPhraseHeader(getDefaultAlienSound());
        setLanguageHead(getDefaultAlienSound());
        setTimerHead(getDefaultAlienSound());
        setColorHead(getDefaultAlienSound());
        setStandardOutputLogHead(getDefaultAlienSound());
        setStandardErrorLogHead(getDefaultAlienSound());
        setReceiptLogHead(getDefaultAlienSound());
        setReceiptLog(getDefaultAlienSound());
        setDefaultUniversityHead(getDefaultAlienSound());
        setDefaultClubHead(getDefaultAlienSound());
        this.LANGUAGE = getDefaultAlienSound();
    }
    public void populateEnglishPhrases(){
        setPhraseHeader("-".repeat(70));
        setLanguageHead("Language:");
        setTimerHead("Time Zone:");
        setColorHead("Color Sequences:");
        setStandardOutputLogHead("Standard Output Log:");
        setStandardErrorLogHead("Standard Error Log:");
        setReceiptLogHead("Receipt Log:");
        setReceiptLog("Receipt-*-*.log");
        setDefaultUniversityHead("Default University:");
        setDefaultClubHead("Default Club:");
        this.LANGUAGE = Config.getDefaultLanguage();
    }
    public void populateChinesePhrases(){

    }
    public void populateFrenchPhrases(){

    }
    public void populateSpanishPhrases(){

    }
    public void populateYourLanguagePhrases(){

    }
    //
    // Additional Methods
    //
    public String getConfigPhrase(int i) {
        return phrases[i];
    }
    public String getLanguage() {
        return theLanguage.LANGUAGE;
    }
    public String getGreetingPhrase(int i) {
        return null;
    }
    //
    // Language
    //
    public String getClubPhrase(int i) {
        return (String) Club.getClubInfo(i);
    }
    public String getUniversityPhrase(int i) {
        if (theLanguage.LANGUAGE == getDefaultAlienSound()){
            return getDefaultAlienSound();
        }
        return Config.getDefaultUniversity();
    }
}
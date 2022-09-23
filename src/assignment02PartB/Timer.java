package assignment02PartB;/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Timer.java
 * @author: Duc Ta
 * @author: Lars Severson
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Timer {
    //
    // Static Data Fields
    //
    private static Timer theTime = null;
    private static String timeAbbreviation;
    private static final List<String> timeZoneList = new ArrayList<>(Arrays.asList("pst", "est", "cst"));
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss '['SSSS 'ms]' a z ' - ' ");
    //
    // Instance Data Fields
    //
    private String TIME_ZONE;
    //
    // Constructors
    //
    public Timer() {

    }
    public Timer(String time){
        if(Language.getTheLanguage().getLanguage() == Language.getDefaultAlienSound()){
            TIME_ZONE = Language.getDefaultAlienSound();
        }
        else if (Language.getTheLanguage().getLanguage() == Config.getDefaultLanguage()){
            TIME_ZONE = time;
        }
        dateFormat.setTimeZone(TimeZone.getTimeZone(timeAbbreviation));
    }
    //
    // Static Methods
    //
    public static String getDateFormat() {
        return dateFormat.format(new Date());
    }
    public static void setDateFormat(DateFormat dateFormat) {
        Timer.dateFormat = (SimpleDateFormat) dateFormat;
    }

    public static Timer setTimeZonePreference(){
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        String timerInput;
        if(Language.getTheLanguage().getLanguage() == Language.getDefaultAlienSound()){
            timerInput = Language.getDefaultAlienSound();
        }
        else{
            timerInput = "Timer: ";
        }

        while(loop){
            System.out.print(timerInput);
            String s = input.nextLine().toUpperCase();
            switch (s){
                case "PST"-> {
                    timeAbbreviation = s;
                    theTime = new Timer("Pacific Standard Time in Day Light Saving");
                    loop = false;
                }
                case "EST"-> {
                    timeAbbreviation = s;
                    theTime = new Timer("Eastern Standard Time in Day Light Saving");
                    loop = false;
                }
                case "CST" -> {
                    timeAbbreviation = s;
                    theTime = new Timer("Central Standard Time in Day Light Saving");
                    loop = false;
                }
                default-> {
                    // Separates the string with respect to the spaces and commas in between, then puts them into a String list
                    String[] items = s.toLowerCase().split("\\s*,\\s*");
                    for(String i : items){
                        if (!timeZoneList.contains(i)){
                            System.out.println("INVALID time zone. Please enter your time zone.");
                            break;
                        }
                    }
                }
            }
        }
        return theTime;
    }
    //
    // Additional Static Methods
    //

    //
    // Instance Methods
    //
    public String getTimeZoneFormatted() {
        return theTime.TIME_ZONE;
    }
    //
    // Additional Instance Methods
    //

    //
    // Language
    //
}
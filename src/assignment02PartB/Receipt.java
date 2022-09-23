package assignment02PartB;
/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Receipt.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public final class Receipt {

    private String receiptLog = "./src/assignment02PartB/log/";
    private FileOutputStream receipt;
    //
    // Constructors
    //
    public Receipt() {

    }
    public Receipt(String firstName, String lastName, String email){
        this.receiptLog += "Receipt-" + firstName.toUpperCase() + "-"
                + lastName.toUpperCase() + "-" + email + ".log";

    }
    //
    // Instance Methods
    //
    public void startLog(){
        try{
            receipt = new FileOutputStream(receiptLog);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public void write(String toWrite){
        byte[] byteArray = toWrite.getBytes();
        try{
            receipt.write(byteArray);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void stopLog(){
        try {
            receipt.close();
            File f = new File(receiptLog);
            f.deleteOnExit();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    //
    // Additional Methods
    //

    //
    // Language
    //
}
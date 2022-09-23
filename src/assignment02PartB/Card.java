package assignment02PartB;
/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Card.java
 * @author: Duc Ta
 * @author: Lars Severson
 * **********************************************
 */

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.ArrayList;
/*
 *  This is where the Card will be held.
 *  I need to have an ArrayList of Cards because if there is more than
 *  one card ordered, I'll need to have a way to access it.
 */

public final class Card {
    //
    // Instance Data Fields
    //
    private int artSize = 0;       // Please change artSize, if needed, to get an identical output
    private int cardCount;

    private String artSymbol = ""; // Please change artFont, if needed, to get an identical output
    private String recipientName;
    private String messageToRecipient;
    private String artFont;

    private ArrayList<Card> cardArray;
    //
    // Constructors
    //
    public Card() {
        cardArray = new ArrayList<>();
    }
    public Card(String recipientName, String artSymbol, String messageToRecipient, int artSize, String artFont){
        this.recipientName = recipientName;
        this.artSymbol = artSymbol;
        this.messageToRecipient = messageToRecipient;
        this.artSize = artSize;
        this.artFont = artFont;
    }
    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //
    public int getArtSize() {
        return artSize;
    }
    public String getRecipientName() {
        return recipientName;
    }
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }
    public String getArtSymbol() {
        return artSymbol;
    }
    public void setArtSymbol(String artSymbol) {
        this.artSymbol = artSymbol;
    }
    public String getMessageToRecipient() {
        return messageToRecipient;
    }
    public void setMessageToRecipient(String messageToRecipient) {
        this.messageToRecipient = messageToRecipient;
    }
    public int getCardCount() {
        return cardCount;
    }
    public void setCardCount(int cardCount) {
        this.cardCount = cardCount;
    }
    public String getArtFont() {
        return artFont;
    }
    public ArrayList<Card> getCardArray() {
        return cardArray;
    }
    public Card getACard(int i){
        return cardArray.get(i);
    }
    //
    // Language
    //

}

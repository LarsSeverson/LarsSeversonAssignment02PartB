package LarsSeversonAssignment02PartB;/*
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

public final class Card {
    //
    // Instance Data Fields
    //
    private int artSize = 0;     // Please change artSize, if needed, to get an identical output
    private String artFont = ""; // Please change artFont, if needed, to get an identical output
    private String recipientName;
    private String artSymbol;
    private String messageToRecipient;
    private int cardCount;
    //
    // Constructors
    //
    public Card() {
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
    public void setArtSize(int artSize) {
        this.artSize = artSize;
    }
    public String getArtFont() {
        return artFont;
    }
    public void setArtFont(String artFont) {
        this.artFont = artFont;
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
    //
    // Language
    //

}

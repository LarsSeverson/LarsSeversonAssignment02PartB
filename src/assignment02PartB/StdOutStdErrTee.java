/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: StdOutStdErrTee.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.io.*;

public class StdOutStdErrTee extends OutputStream {

    //
    // Instance Data Fields
    //
    private String stdOutFilePath;
    private String stdErrFilePath;
    private OutputStream[] streamsToConsoleToFile;

    //
    // Constructors
    //
    public StdOutStdErrTee() {
        this.stdOutFilePath = Config.getDefaultStdOutFilePath();
        this.stdErrFilePath = Config.getDefaultStdErrFilePath();
    }
    public StdOutStdErrTee(PrintStream printStream, FileOutputStream fileOutputStream) {
        this.streamsToConsoleToFile = new OutputStream[2];
        streamsToConsoleToFile[0] = printStream;
        streamsToConsoleToFile[1] = fileOutputStream;
    }
    //
    // Instance Methods
    //
    public void startLog() {
        try {
            FileOutputStream stdOutFile = new FileOutputStream(this.stdOutFilePath);
            FileOutputStream stdErrFile = new FileOutputStream(this.stdErrFilePath);

            StdOutStdErrTee allStdOut = new StdOutStdErrTee(System.out, stdOutFile);
            StdOutStdErrTee allStdErr = new StdOutStdErrTee(System.err, stdErrFile);

            PrintStream stdOut = new PrintStream(allStdOut);
            PrintStream stdErr = new PrintStream(allStdErr);

            System.setOut(stdOut);
            System.setErr(stdErr);

        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void stopLog() {
        try{
            streamsToConsoleToFile[0].close();
            streamsToConsoleToFile[1].close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    //
    // Override
    //
    @Override
    public void write(int b) throws IOException {

    }

    public String getStdOutFilePath() {
        return Language.getTheLanguage().getLanguage() == Language.getDefaultAlienSound() ? Language.getDefaultAlienSound() : stdOutFilePath;
    }

    public String getStdErrFilePath() {
        return Language.getTheLanguage().getLanguage() == Language.getDefaultAlienSound() ? Language.getDefaultAlienSound() : stdErrFilePath;
    }
}
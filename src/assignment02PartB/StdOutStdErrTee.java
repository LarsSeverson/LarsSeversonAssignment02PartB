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

import assignment02PartB.Config;

import java.io.*;

public class StdOutStdErrTee extends OutputStream {

    //
    // Instance Data Fields
    //
    private String stdOutFilePath = Config.getDefaultStdOutFilePath();
    private String stdErrFilePath = Config.getDefaultStdErrFilePath();
    private OutputStream[] streamsToConsoleToFile = new OutputStream[2];

    private PrintStream originalOut = System.out;
    private PrintStream originalErr = System.err;
    //
    // Constructors
    //
    public StdOutStdErrTee() {

    }

    public StdOutStdErrTee(PrintStream printStream, FileOutputStream fileOutputStream) {
        streamsToConsoleToFile[0] = printStream;
        streamsToConsoleToFile[1] = fileOutputStream;
    }

    public StdOutStdErrTee(String stdOutFilePath, String stdErrFilePath) {
        this.stdOutFilePath = stdOutFilePath;
        this.stdErrFilePath = stdErrFilePath;
    }

    //
    // Instance Methods
    //
    public void startLog() {
        try{
            FileOutputStream out = new FileOutputStream(stdOutFilePath);
            FileOutputStream err = new FileOutputStream(stdErrFilePath);

            StdOutStdErrTee allStdOut = new StdOutStdErrTee(System.out, out);
            StdOutStdErrTee allStdErr = new StdOutStdErrTee(System.err, err);

            PrintStream stdOut = new PrintStream(allStdOut);
            PrintStream stdErr = new PrintStream(allStdErr);

            System.setOut(stdOut);
            System.setErr(stdErr);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void stopLog() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    public String getStdOutFilePath() {
        return stdOutFilePath;
    }
    public String getStdErrFilePath() {
        return stdErrFilePath;
    }

    //
    // Override
    //
    @Override
    public void write(int b) throws IOException {
        for (OutputStream out : this.streamsToConsoleToFile) {
            out.write(b);
            out.flush();
        }
    }
}
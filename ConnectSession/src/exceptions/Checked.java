package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Checked {
    public static void main(String[] args) {
        try {
            readFile();
            runThread();
            instantiateObject();
        } catch (Exception e) {

        }
    }

    private static void readFile() throws IOException {
       // Do some file reading stuff
       // fails to read file
        throw new IOException();
    }

    private static void runThread() throws InterruptedException {
        // Some process running
        // gets interrupted
        throw new InterruptedException();
    }

    private static void instantiateObject() throws InstantiationException {
        // tries to instantiate an object but it cannot be done
        throw new InstantiationException();
    }
}

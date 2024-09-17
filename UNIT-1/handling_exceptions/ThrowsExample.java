package handling_exceptions;

import java.io.*;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile();  // Calling a method that throws an exception
        } catch (IOException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    // Method declares that it throws IOException
    public static void readFile() throws IOException {
        FileReader file = new FileReader("non_existent_file.txt");
    }
}


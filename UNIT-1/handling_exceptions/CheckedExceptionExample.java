// package handling_exceptions;

import java.io.*;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("tests.txt");
        }catch(IOException ioException){
            System.out.println("Invalid file name.");
        }
    }
}

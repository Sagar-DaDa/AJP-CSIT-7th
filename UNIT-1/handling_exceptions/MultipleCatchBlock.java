

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Please enter file name:");
            String fileName = scanner.nextLine();
            FileReader file = new FileReader(fileName);
            double result = a/b;
        }catch(IOException ioException){
            System.out.println("File not found or could not be opened.");
        }catch(ArithmeticException arithmeticException){
            System.out.println("Divide by zero exception.");
        }finally{
            System.out.println("Inside finally block");
            scanner.close();
        }
    }
}

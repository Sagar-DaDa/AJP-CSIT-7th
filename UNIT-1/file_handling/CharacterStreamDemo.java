import java.io.*;

public class CharacterStreamDemo {
    public static void main(String[] args) {
        // Writing to a file
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("We are from CSIT 7th.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from the file
        try (FileReader fr = new FileReader("output.txt")) {
            char[] buffer = new char[50];
            int charsRead = fr.read(buffer); // Reads characters into the buffer
            for (int i = 0; i < charsRead; i++) {
                System.out.print(buffer[i]); // Prints characters read from the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamDemo {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            // Create FileInputStream to read from the input file
            in = new FileInputStream("input.txt");
            
            // Create FileOutputStream to write to the output file
            out = new FileOutputStream("output1.txt");
            
            int c;
            // Read bytes from the input file and write them to the output file
            System.out.println("Reading file...");
            while ((c = in.read()) != -1) {
                System.out.print((char)c);
                out.write(c);
            }
        } catch (IOException e) {
            // Handle potential IO exceptions
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            try {
                // Close the streams
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

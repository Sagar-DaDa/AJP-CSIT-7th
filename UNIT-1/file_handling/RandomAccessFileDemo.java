import java.io.*;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        try {
            // Create a RandomAccessFile object to open "test.txt" in read-write mode
            RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
            
            // Write some data to the file
            raf.writeUTF("Hello World"); // Write "Hello World" at the beginning
            raf.writeUTF("Hi");          // Write "Hi" immediately after
            
            // Move the file pointer to the start of the file
            raf.seek(0);
            
            // Read and print the first string
            System.out.println(raf.readUTF()); // Output: Hello World
            
            // Print the current file pointer position
            long pos = raf.getFilePointer();
            System.out.println("Current Position: " + pos); // Output: Position after reading "Hello World"
            
            // Read and print the next string
            System.out.println(raf.readUTF()); // Output: Hi
            
            // Move the file pointer back to the start and read the first string again
            raf.seek(0);
            System.out.println(raf.readUTF()); // Output: Hello World
            
            // Move the file pointer to position 13 and read from there
            raf.seek(13);
            System.out.println(raf.readUTF()); // Output: Hi
            
            // Close the file
            raf.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

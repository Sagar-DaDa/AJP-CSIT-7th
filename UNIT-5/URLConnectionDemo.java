import java.io.*;
import java.net.*;

public class URLConnectionDemo {
    public static void main(String[] args) {
        try {
            // Creating a URL object
            URL url = new URL("https://www.google.com");

            // Opening a connection to the URL
            URLConnection urlConnection = url.openConnection();

            // Getting the input stream to read data from the URL
            InputStream stream = urlConnection.getInputStream();
            
            // Reading and displaying the content of the webpage
            int i;
            while ((i = stream.read()) != -1) {
                System.out.print((char) i);
            }

            // Closing the stream
            stream.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


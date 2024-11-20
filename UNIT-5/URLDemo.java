import java.net.*;

public class URLDemo {
    public static void main(String[] args) {
        try {
            // Creating a URL object
            @SuppressWarnings("deprecation")
            URL url = new URL("https://getbootstrap.com/docs/5.3/getting-started/download.html");

            // Getting different parts of the URL
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());        
            System.out.println("Port: " + url.getPort());        
            System.out.println("File: " + url.getFile());        

            // Opening a connection
            URLConnection connection = url.openConnection();
            System.out.println("Connection opened successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


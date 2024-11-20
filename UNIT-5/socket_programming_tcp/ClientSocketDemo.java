import java.net.*;
import java.io.*;
import java.util.*;

public class ClientSocketDemo {
    public static void main(String[] args) throws IOException {
        //Open connection to a server, at port 1254
        Socket socket = new Socket("localhost", 1254);

        //Get an input object from the socket and read the input
        Scanner ins = new Scanner(socket.getInputStream());
        PrintWriter outs = new PrintWriter(socket.getOutputStream(), true);
        
        //Perform IO
        outs.println("Hello Server");
        String response = ins.nextLine();
        System.out.println("From Server: " + response);
        
        //Close streams and connection
        ins.close();
        outs.close();
        socket.close();
    }
}


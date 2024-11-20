import java.net.*;
import java.io.*;
import java.util.*;

class ServerSocketDemo {
    public static void main(String[] args) throws IOException {
        //Creating ServerSocket on port 1254
        ServerSocket serverSocket = new ServerSocket(1254);

        System.out.println("Server is running...");

        //Wait and accept a connection
        Socket clientSocket = serverSocket.accept();
    
        //Get a connection stream associated with the socket
        Scanner ins = new Scanner(clientSocket.getInputStream());
        PrintWriter outs = new PrintWriter(clientSocket.getOutputStream(), true);
        
        //Perform IO
        String message = ins.nextLine();
        System.out.println("From Client: " + message);
        outs.println("Hello Client");
        
        //Close streams and connection
        ins.close();
        outs.close();
        clientSocket.close();
        serverSocket.close();
    }
}


import java.net.*;
import java.io.*;
import java.util.Scanner;

public class SingleChatClient {
    public static void main(String[] args) throws IOException {
        // Establish a connection to the server on localhost, port 1254
        Socket socket = new Socket("localhost", 1254);

        // Input stream to receive messages from server
        Scanner ins = new Scanner(socket.getInputStream());
        // Output stream to send messages to server
        PrintWriter outs = new PrintWriter(socket.getOutputStream(), true);
        // Scanner to get user input from console
        Scanner ink = new Scanner(System.in);

        String rmsg, smsg;
        do {
            // Receive message from server
            rmsg = ins.nextLine();
            System.out.println("Server: " + rmsg);

            // Prompt the client to enter a message
            System.out.print("Client: ");
            smsg = ink.nextLine();
            outs.println(smsg); // Send message to server

        } while (!rmsg.equalsIgnoreCase("bye")); // End chat if "bye" is received

        // Close resources
        ins.close();
        outs.close();
        socket.close();
    }
}

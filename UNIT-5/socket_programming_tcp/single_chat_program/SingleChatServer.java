import java.net.*;
import java.io.*;
import java.util.Scanner;

public class SingleChatServer {
    public static void main(String[] args) throws IOException {
        // Start the server on port 1254
        ServerSocket serverSocket = new ServerSocket(1254);

        System.out.println("Server is running on port 1254...");

        // Accept client connection
        Socket clientSocket = serverSocket.accept();

        // Input stream to receive messages from client
        Scanner ins = new Scanner(clientSocket.getInputStream());
        // Output stream to send messages to client
        PrintWriter outs = new PrintWriter(clientSocket.getOutputStream(), true);
        // Scanner to get user input from console
        Scanner ink = new Scanner(System.in);

        String rmsg, smsg;
        do {
            // Prompt the server to enter a message
            System.out.print("Server: ");
            smsg = ink.nextLine();
            outs.println(smsg); // Send message to client

            // Receive message from client
            rmsg = ins.nextLine();
            System.out.println("\tClient: " + rmsg);

        } while (!rmsg.equalsIgnoreCase("bye")); // End chat if "bye" is received

        // Close resources
        outs.close();
        ins.close();
        clientSocket.close();
        serverSocket.close();
    }
}

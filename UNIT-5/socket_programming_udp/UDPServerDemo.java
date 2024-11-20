import java.net.*;
import java.io.*;

public class UDPServerDemo {
    public static void main(String[] args) throws IOException {
        byte[] buf = new byte[256];

        // Create datagram socket
        DatagramSocket socket = new DatagramSocket(4445);
        System.out.println("Server is running on port 4445...");

        // Receive request
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);

        // Prepare response
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        String response = "Hello from server.";
        buf = response.getBytes();

        // Send the response to the client at "address" and "port"
        packet = new DatagramPacket(buf, buf.length, address, port);
        socket.send(packet);

        // Close the socket
        socket.close();
    }
}

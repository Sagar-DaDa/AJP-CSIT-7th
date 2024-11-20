import java.net.*;
import java.io.*;

public class UDPClientDemo {
    public static void main(String[] args) throws IOException {
        // Create socket
        DatagramSocket socket = new DatagramSocket();

        // Prepare data to send
        byte[] buf = new byte[256];
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);

        // Send request
        socket.send(packet);

        // Get response
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);

        // Display response
        String received = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Message from server: " + received);

        // Close the socket
        socket.close();
    }
}

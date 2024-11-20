import java.net.*;

class InetAddressDemo {
    public static void main(String[] args) throws Exception {
        // Obtain an InetAddress instance for a specific hostname
        InetAddress ip = InetAddress.getByName("www.facebook.com");

        // Print the hostname and IP address
        System.out.println("Host Name: " + ip.getHostName());
        System.out.println("IP Address: " + ip.getHostAddress());
    }
}

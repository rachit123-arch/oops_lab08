package labsheet08.question11;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Question11InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("Host Name: " + address.getHostName());
        System.out.println("IP Address: " + address.getHostAddress());
    }
}

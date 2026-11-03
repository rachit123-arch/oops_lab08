package labsheet08.question16;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MessageSender {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) {
            byte[] data = "Ping".getBytes();
            DatagramPacket packet = new DatagramPacket(
                data, data.length, InetAddress.getByName("localhost"), 6000);
            socket.send(packet);
            System.out.println("Sent Ping to UDP server.");
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}

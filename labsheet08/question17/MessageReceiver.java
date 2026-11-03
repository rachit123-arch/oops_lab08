package labsheet08.question17;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MessageReceiver {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(6000)) {
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            System.out.println("Waiting for UDP message...");
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received: " + message);
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}

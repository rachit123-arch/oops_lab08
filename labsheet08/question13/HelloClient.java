package labsheet08.question13;

import java.io.PrintWriter;
import java.net.Socket;

public class HelloClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
            writer.println("Hello Server");
            System.out.println("Message sent to server.");
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}

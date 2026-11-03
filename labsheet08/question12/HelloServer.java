package labsheet08.question12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started on port 5000...");
            try (Socket clientSocket = serverSocket.accept()) {
                System.out.println("Client connected");
                BufferedReader reader = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
                String message = reader.readLine();
                System.out.println("Received from client: " + message);
            }
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}

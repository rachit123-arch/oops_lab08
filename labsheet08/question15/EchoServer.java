package labsheet08.question15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5001)) {
            System.out.println("Echo server started on port 5001...");
            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader reader = new BufferedReader(
                         new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter writer = new PrintWriter(
                         clientSocket.getOutputStream(), true)) {
                    String message = reader.readLine();
                    if (message != null) {
                        writer.println(message);
                    }
                }
            }
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}

package labsheet08.question20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiClientServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5002)) {
            System.out.println("Multi-client server started on port 5002...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                Thread clientThread = new Thread(
                    () -> handleClient(clientSocket), "ClientThread-" + clientSocket.getPort());
                clientThread.start();
            }
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) {
        try (clientSocket;
             BufferedReader reader = new BufferedReader(
                 new InputStreamReader(clientSocket.getInputStream()))) {
            String message = reader.readLine();
            System.out.println(Thread.currentThread().getName() + ": " + message);
        } catch (Exception exception) {
            System.err.println(Thread.currentThread().getName() + ": " + exception.getMessage());
        }
    }
}

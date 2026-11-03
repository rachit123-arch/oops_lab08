package labsheet08.question15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5001);
             Scanner input = new Scanner(System.in);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(
                 new InputStreamReader(socket.getInputStream()))) {
            System.out.print("Enter message: ");
            String message = input.nextLine();
            writer.println(message);
            System.out.println("Echo: " + reader.readLine());
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}

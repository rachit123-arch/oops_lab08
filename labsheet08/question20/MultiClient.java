package labsheet08.question20;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MultiClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5002);
             Scanner input = new Scanner(System.in);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
            System.out.print("Enter message: ");
            writer.println(input.nextLine());
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}

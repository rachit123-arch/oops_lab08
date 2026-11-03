package labsheet08.question18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class WebReader {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                 new InputStreamReader(new URL("http://example.com").openStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}

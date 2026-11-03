package labsheet08.question19;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileDownloader {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com/sample.txt");
            URLConnection connection = url.openConnection();
            try (InputStream input = connection.getInputStream()) {
                Files.copy(input, Path.of("downloaded_sample.txt"), StandardCopyOption.REPLACE_EXISTING);
            }
            System.out.println("Downloaded to downloaded_sample.txt");
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderTester {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "src/file.txt";

        try {
            // Use the Stream API to read lines from the file
            Stream<String> lines = Files.lines(Paths.get(filePath));

            // Process each line using forEach
            lines.forEach(line -> System.out.println(line));

            // Close the stream when done
            lines.close();
        } catch (IOException e) {
            // Handle potential IOException
            e.printStackTrace();
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
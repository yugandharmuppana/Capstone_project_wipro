//Write a program to write data into a file using Files.write() and append
//using StandardOpenOption.APPEND.

package File_Handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class WriteAppendFile {

	public static void main(String[] args) throws IOException {
        Path path = Paths.get("dataFile.txt");

        // Write data into a file 
        String content = "Hello, this is the first line.\n";
        Files.write(path, content.getBytes()); 
        System.out.println("Initial data written.");

        // Append more data to the same file
        String moreContent = "This is the appended line.\n";
        Files.write(path, moreContent.getBytes(), StandardOpenOption.APPEND);
        System.out.println("Data appended.");
    }
}
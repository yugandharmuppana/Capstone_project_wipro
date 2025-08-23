package File_Handling;

import java.io.*;
import java.util.*;

public class AllFileOperations {

    public static void main(String[] args) throws IOException {
        File f = new File("Yugandhar.txt");

        try 
        {
            if (f.createNewFile()) 
            {
                System.out.println("File created: " + f.getName());
            } 
            else 
            {
                System.out.println("File already exists.");
            }
            System.out.println("Writable: " + f.setWritable(true));
            } 
        catch (Exception e) 
        {
            System.out.println("Error creating file");
            e.printStackTrace();
        }

        if (f.exists()) 
        {
            System.out.println("File name: " + f.getName());
            System.out.println("File location: " + f.getAbsolutePath());
            System.out.println("File length: " + f.length());
            System.out.println("File readable: " + f.canRead());
            System.out.println("File writable: " + f.canWrite());
        } 
        else 
        {
            System.out.println("File not found");
        }

        // Writing to the file
        try (PrintWriter pw = new PrintWriter(new FileWriter("Yugandhar.txt"))) {
            pw.println("Hello");
            pw.println("Welcome to Wipro training program");
            System.out.println("Successfully written to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from the file
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Yugandhar.txt"))) {
            String line;
            while ((line = br.readLine()) != null) 
            {
                lines.add(line);
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        System.out.println("Contents of the file:");
        for (String str : lines) 
        {
            System.out.println(str);
        }
    }
}

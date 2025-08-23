package File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_use {

	public static void main(String[] args) {
		try {
			BufferedWriter w=new BufferedWriter(new FileWriter("sample.txt"));
			w.write("Hello");
			w.newLine();
			w.write("Welcome to Java Learning sessions");
			w.close();
			System.out.println("write file successfully");
			} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
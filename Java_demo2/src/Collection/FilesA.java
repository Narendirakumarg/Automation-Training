package Collection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesA {

	public static void main(String[] args) throws IOException {
		File f1 = new File("E:\\Selenium Setup - Working\\New folder\\Text.txt");
		File f2 = new File("E:\\Selenium Setup - Working\\New folder\\Text.xls");
		File f3 = new File("E:\\Selenium Setup - Working\\New folder\\Text.pdf");

		FileWriter fw = new FileWriter(f1);
		BufferedWriter writer = new BufferedWriter(fw);

		writer.write("Killer ABD");
		writer.newLine();
		writer.write("Welcome");

		writer.close();

		// FileWriter fw1 = new FileWriter(f2);
		// BufferedWriter writer1 = new BufferedWriter(fw1);
		// writer1.write("Killer ABD");
		// writer1.newLine();
		// writer1.write("Welcome");
		//
		// writer1.close();
		//
		// FileWriter fw2 = new FileWriter(f3);
		// BufferedWriter writer2 = new BufferedWriter(fw2);
		// writer2.write("Killer");
		// writer2.newLine();
		// writer2.write("Welcome");
		//
		// writer2.close();

		FileReader fr = new FileReader(f1);
		BufferedReader reader = new BufferedReader(fr);

		String line1 = reader.readLine();
		System.out.println(line1);

		String line2 = reader.readLine();
		System.out.println(line2);

		String line3 = reader.readLine();
		System.out.println(line3);

//		while(reader.readLine()!=null) 
//		{
//			System.out.println(reader.readLine());
//
//		}		
//		reader.close();

		String line;

		while (line.reader.readLine() != null) {
			System.out.println(line);

		}
		reader.close();

	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws FileNotFoundException {
		// If the File is in the project root Java does'nt require the full path to file, just the name is OK.
		// String myFile = "/home/elarsaks/Desktop/Java Basics/Scanner Class/test.txt";
		
		String myFile = "test.txt";
		
		File file = new File(myFile);
		
		Scanner text = new Scanner(file);
		
		int value = text.nextInt();
		System.out.println("Value is: " + value);
		
		while(text.hasNextLine()) {
			String line = text.nextLine();
			
			System.out.println(line);
		}
		
		text.close();
		
		
	}
}

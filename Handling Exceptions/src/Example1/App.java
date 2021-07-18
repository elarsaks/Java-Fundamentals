package Example1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("example.text");
		
		Scanner readFile = new Scanner(file);
	}
}

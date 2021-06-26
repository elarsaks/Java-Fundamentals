import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your instructions: ");
		String text = input.nextLine();
		
		switch (text ) {
		case "run":
			System.out.println("Program is running");
			break;
		case "stop":
			System.out.println("Program stopped");
			break;
		default: 
			System.out.println("INstructions not reconized");
		}
		
	}
}

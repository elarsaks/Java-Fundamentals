import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = 0;

		System.out.println("Enter a text line: ");
		String text = input.nextLine();
		System.out.println("Your line is: " + text);

		do {
			System.out.println("Enter a number: ");
			number = input.nextInt();
		} while (number != 9);
		System.out.println("You got 9!");

	}
}

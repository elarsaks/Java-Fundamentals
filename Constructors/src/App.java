class Program {
	int value;
	String text;
	
	public Program() {
		// Call to the constructor
		// Calls also the next constructor with parameter 5
		// Has to be the first line
		this(5); 
		System.out.println("First Constructor");
		value = 12;
	}
	
	public Program(int value){
		this.value = value;
		
		System.out.println("Second constructor ");
	}
	
	public Program(int value, String text) {
		this.value = value;
		this.text = text;
		
		System.out.println("Third constructor");
	}
}


public class App {

	public static void main(String[] args) {
		// Java selects correct constructor based on parameters passed.
		Program myProgram = new Program();
		Program myProgram1 = new Program(2);
		Program myProgram2 = new Program(2, "Hi");
	}

}

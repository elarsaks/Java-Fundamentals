class Methods {
	String animal;
	int value;
	int month;
	
	void run() {
		System.out.println("Running!");
		System.out.println("My " + animal + " is " + value + " years old.");
	}
	
	int calculateMonthsToBirthday() {
		int monthsLeft = 12 - month;
		return monthsLeft;
	}
	
	void talk(String text) {
		System.out.println(text);
	}
}

public class App {
	public static void main(String[] args) {
		Methods name = new Methods();
		name.animal = "cat";
		name.value = 1;
		name.month = 8;
		name.run();
		
		int months = name.calculateMonthsToBirthday();
		System.out.println(months);
		
		name.talk("Hi, I am Steven!");
	}
}

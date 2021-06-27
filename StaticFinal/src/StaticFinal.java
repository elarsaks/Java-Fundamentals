class Student {
	
	public static final int MY_CONSTANT = 8;
	
	public String name;
	public static String studentClass;
	
	public void studentName() {
		System.out.println(name + " is enrolled in: " + studentClass);
		// Non static methods can access static data!
	}
	
	public static void classInfo() {
		System.out.println(studentClass);
		// This gives error: System.out.println(name);
	}
}


public class StaticFinal {

	public static void main(String[] args) {
		
		Student.studentClass = "Web Development Fundamentals";
		System.out.println(Student.studentClass);
		
		Student.classInfo();
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.name = "Steven";
		student2.name = "Daniel";
		
		student1.studentName();
		student2.studentName();
		
		System.out.println(Student.MY_CONSTANT);
	}

}

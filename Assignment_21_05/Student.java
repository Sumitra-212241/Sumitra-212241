package Assignment_21_05;

public class Student {
	
	String name;
	int age;
	int roll_number;
	
	public void displayDetails() {
		System.out.println("name " +name);
		System.out.println("age " +age);
		System.out.println("roll_number" +roll_number);
	}
	
	
	

	public static void main(String[] args) {
		Student s =new Student();
		s.name = "Siri";
		s.age = 25;
		s.roll_number = 02;
		s.displayDetails();

	}

}

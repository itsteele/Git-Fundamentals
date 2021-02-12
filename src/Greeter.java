import java.util.Scanner;

public class Greeter {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void Greeter() {

	System.out.println("Hello, what is your name?");
	String name = scan.nextLine();
	
	System.out.println("What's up " + name + " it's nice to meet you!");
	}
	
	public static void Birthday() {
		System.out.println("Please enter your age and date of birth 00/00/0000");
		System.out.println("Age: ");
		int age = scan.nextInt();
		System.out.println("Month: ");
		int month = scan.nextInt();
		System.out.println("Day:");
		int day = scan.nextInt();
		System.out.println("Year:");
		int year = scan.nextInt();
		
		System.out.println("Age: " + age);
		System.out.println("DOB: " + month + "/" + day + "/" + year);
		
	}
	
	public static void main(String[] args) {
		
		Greeter();
		Birthday();
	}
}

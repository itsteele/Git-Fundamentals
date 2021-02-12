import java.util.Scanner;

public class Greeter {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Hello, what is your name?");
	String name = scan.nextLine();
	
	System.out.println("What's up " + name + " it's nice to meet you!");
	}
}

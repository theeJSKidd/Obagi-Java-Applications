import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter your address: ");
		String address = input.nextLine();
		
		System.out.print("Enter your Age: ");
		byte age = input.nextByte();
		
		System.out.println();
		System.out.printf("Hi %s, you are welcome to first bank%n", name);
		System.out.printf("you are living in %s%n ", address);
		System.out.printf("you are %d years old", age);
	
	}
	
}
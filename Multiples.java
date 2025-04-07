import java.util.Scanner;

public class Multiples{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		System.out.println("The first 15 multiples of " + num);
		
		int i = 1;
		while(i <= 15){
			System.out.println(num * i);
			i++;
		}
	}
}
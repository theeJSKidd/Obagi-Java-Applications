import java.util.Scanner;

public class NestedIfElse{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = input.nextLine();
		
		System.out.print("Enter Mark: ");
		int mark = input.nextInt();
		
		if(mark >100){
			System.out.println("Mark cannot be greater than 100");
		}
		else{
		
		if(mark >= 80){
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your name is %d%n",mark);
			System.out.printf("Your grade is %c",'B');
		}
		else if(mark >= 70){
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your name is %d%n",mark);
			System.out.printf("Your grade is %c",'C');
		}
		else if(mark >= 60){
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your name is %d%n",mark);
			System.out.printf("Your grade is %c",'D');
		}
		else if(mark >= 50){
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your name is %d%n",mark);
			System.out.printf("Your grade is %c",'E');
		}
		else if(mark >= 40){
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your name is %d%n",mark);
			System.out.printf("Your grade is %c",'B');
		}
		else{
			
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your name is %d%n",mark);
			System.out.printf("Your grade is %c",'F');
		}
		}
	}
}

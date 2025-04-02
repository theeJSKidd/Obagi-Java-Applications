import java.util.Scanner;

public class SwitchCaseStatement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter *131# to Load Data");
		System.out.println("Enter *310# to Check Balance");
		System.out.println("Enter *303# to Borrow Data");
		
		System.out.print("Enter code: ");
		String option = input.nextLine();
		
		switch(option){
			case "*131#":
			{
				System.out.println("");
				System.out.println("Enter 1 for 1 Month Plan");
				System.out.println("Enter 2 for 1 Month Plan");
				System.out.println("Enter 3 for 1 Month Plan");
				System.out.println("Enter 4 for 1 Month Plan");
				System.out.println("");
				
				System.out.print("Enter code: ");
				int code = input.nextInt();
				
				switch(code){
					case 1:
					{
						System.out.println("Your 1 month subscription have been activated!");
					}
					break;
					
					case 2:
					{
						System.out.println("Your 2 month subscription have been activated!");
					}
					break;
					
					case 3:
					{
						System.out.println("Your 3 month subscription have been activated!");
					}
					break;
					
					case 4:
					{
						System.out.println("Your 4 month subscription have been activated!");
					}
					break;
					default:
					System.out.println("Invalid Input!");
				}
			}
			break;
			
			case "*310#":
			{
				System.out.println("Your balance is N782.97");
			}
			break;
			
			case "*303#":
			{
				System.out.println("");
				System.out.println("Enter 1 to Borrow 1000");
				System.out.println("Enter 2 to Borrow 2500");
				System.out.println("Enter 3 to Borrow 4500");
				System.out.println("Enter 4 to Borrow 7000");
				
				System.out.print("Enter code: ");
				int code = input.nextInt();
				
				switch(code){
					case 1:
					{
						System.out.println("Your account has been credited with N1000");
					}
					break;
					
					case 2:
					{
						System.out.println("Your account have been credited with N2500");
					}
					break;
					
					case 3:
					{
						System.out.println("Your account have been credited with N4500");
					}
					break;
					
					case 4:
					{
						System.out.println("Your account have been credited with N7000");
					}
					break;
					
					default:
					System.out.println("Invalid code");
				}
			}
			break;
			
			default:
			System.out.println("Invalid Input!");
		}
	}
}
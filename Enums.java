public class Enums{
	public static void main(String[] args){
		AccountType type = AccountType.SAVINGS;
		
		switch(type){
			case SAVINGS:
			{
				System.out.println("Your savings account has successfully been created with an interest of 2.5%");
			}
			break;
			
			case CHECKING:
			{
				System.out.println("Your checking account has successfully been created with zero interest rate");
			}
			break;
			
			case FIXED_DEPOSIT:
			{
				System.out.println("Your fixed deposit account has successfully been created with an interest of 5%");
			}
			break;
		}
	}
}
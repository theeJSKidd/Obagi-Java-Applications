import java.security.SecureRandom;


public class SecureRandomNumberGenerator{
	public static void main(String[] args){
		SecureRandom secureRan = new SecureRandom();
		
		Boolean option = secureRan.nextBoolean();
		System.out.printf("Do you love Java? %b%n",option);
		
		int integer = secureRan.nextInt();
		System.out.printf("The integer is %d%n",integer);
		
		int integerWithBound = secureRan.nextInt(101);
		System.out.printf("The integer is %d%n",integerWithBound);
		
		long number = secureRan.nextLong();
		System.out.printf("The integer is %d%n",number);
		
		long numberWithBNounds= secureRan.nextLong(8_000_000_000L);
		System.out.printf("The integer is %d%n",numberWithBNounds);
		
		float floatNumber = secureRan.nextFloat();
		System.out.printf("The integer is %f%n",floatNumber);
		
		double doubleNumber = secureRan.nextDouble();
		System.out.printf("The integer is %f%n",doubleNumber);
	}
}
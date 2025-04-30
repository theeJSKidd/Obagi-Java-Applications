import java.util.Random;


public class RandomNumberGenerator{
	public static void main(String[] args){
		Random ran = new Random();
		
		Boolean option = ran.nextBoolean();
		System.out.printf("Do you love Java? %b%n",option);
		
		int integer = ran.nextInt();
		System.out.printf("The integer is %d%n",integer);
		
		int integerWithBound = ran.nextInt(101);
		System.out.printf("The integer is %d%n",integerWithBound);
		
		long number = ran.nextLong();
		System.out.printf("The integer is %d%n",number);
		
		long numberWithBNounds= ran.nextLong(8_000_000_000L);
		System.out.printf("The integer is %d%n",numberWithBNounds);
		
		float floatNumber = ran.nextFloat();
		System.out.printf("The integer is %f%n",floatNumber);
		
		double doubleNumber = ran.nextDouble();
		System.out.printf("The integer is %f%n",doubleNumber);
	}
}
public class DataType{
	public static void main(String[] args){
		//Integer type(byte,short,int,long)
		
		byte age = 50;
		System.out.printf("Your age is %d%n", age);
		
		short quantity = 32000;
		System.out.printf("I bought %d quantity of bags fo my business%n", quantity);
		
		int populationInNigeria = 1000000000;
		System.out.printf("The total population in Nigeria is %d%n", populationInNigeria);
		
		long worldPopulation = 800000000000L;
		System.out.printf("The world population is %d%n", worldPopulation);
		
		//float-point type(float, double)
		float myBalance = 123589.6484683F;
		System.out.printf("Your account balance  is %f%n", myBalance);
		
		double cbnReserve = 75983682.7483638367637353748;
		System.out.printf("The CBN balance is %.5f%n", cbnReserve);
		
		//Boolean type (boolean)
		boolean JavaFun = true;
		System.out.printf("is Java a fun language? %b%n", JavaFun);
		
		//Character type(char)
		char alpha = '@';
		System.out.printf("My email is blessedtunde81%cgmail.com", alpha);
	}
}
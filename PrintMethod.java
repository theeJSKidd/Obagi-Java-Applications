public class PrintMethod {
	public static void main(String[] args){
		//using the print()
		System.out.print("\"Learning Java is Fun Hey\"\n");
		System.out.print("come and learn Java with me");
		
		//using the println()
		System.out.println();
		System.out.println("I want to tell you that java is different from javascript");
		System.out.println("\t this is the indented text");
		
		//using the printf()
		System.out.printf("My name is %s. and i love %s. Good everyone","blessed","Java");
		System.out.printf("I am %d years old%n",25); 
		System.out.printf("I bought jva JDK with %f naira%n", 159.345);
		System.out.printf("I bought jva JDK with %c%.2f naira%n",'$',159.345);
		
		boolean isJavaFun = true;
		System.out.printf("is JAVA fun? %b", isJavaFun);
		
	}
	
} 
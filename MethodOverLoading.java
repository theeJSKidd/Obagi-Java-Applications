public class MethodOverLoading{
	public static void main(String[] args){
		
		public static void greeting(){
			System.out.println("Good Afternoon, Everyone");
		}
		
		public static void greeting(){
			System.out.println("Good Afternoon,%s%n",name);
		}
		
		public static void greeting(String name , int age){
			System.out.println("Good Afternoon,%s you are %d%n years old ",name,age);
		}
		
		public static void greeting(){
			System.out.println("Good Afternoon,%s you are %d years old and you are a %s%n",name, age);
	    } 
	}
}
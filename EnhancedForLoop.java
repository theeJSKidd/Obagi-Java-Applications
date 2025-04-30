public class EnhancedForLoop{
	public static void main(String [] args){
		int[] numbers = {9,8,7,6,5};
		
		System.out.println("This is the traditional for loop");
		for(int i = 0; i<5; i++){
			System.out.printf("%d%n", numbers[i]);
		}
		System.out.println("=======================================");
		for(int num : numbers){
			System.out.printf("%d%n", num);
		}
	}
}
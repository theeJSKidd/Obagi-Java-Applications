public class IterationofNumbers{
	public static void main(String[] args){
		
		for(int i = 1; i <= 20; i++){
			if(i == 2 || i == 5 || i == 9 || i == 13 || i == 19){
				continue;
			}
			System.out.printf("%d%n",i);
		}
	}
}
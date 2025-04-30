public class MultiDimensionalArrays{
	public static void main(String[] args){
		
		int[][] numbers ={
						{31,15,20,16},
						{45,12,34,35},
						{18,17,54,28},
						};
						
			int sum = 0;
			for(int row = 0; row < 4; col++){
				for(int col = 0; col < 4; col++){
					sum += numbers[row][col];
				}
			}
			System.out.printf("The sum of all the number is %d%n",sum);
		}
	}		
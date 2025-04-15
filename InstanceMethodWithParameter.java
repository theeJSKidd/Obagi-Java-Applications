public class InstanceMethodWithParameter{
	public static void main(String [] args){
		InstanceMethodWithReturnType imwrt = new InstanceMethodWithReturnType();
		imwrt.addition();
	}
	
	public int addition(int num1 , int num2){
		int sum = num1 + num2;
		
		return sum;
	}
}
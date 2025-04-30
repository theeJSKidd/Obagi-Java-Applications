public class VariableLengthArgumentList {
    public static int product(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("Product of 1, 2, 3: " + product(1, 2, 3));
        System.out.println("Product of 4, 5: " + product(4, 5));
        System.out.println("Product of 6: " + product(6));
        System.out.println("Product of no numbers: " + product());
        System.out.println("Product of 2, 3, 4, 5: " + product(2, 3, 4, 5));
    }
}
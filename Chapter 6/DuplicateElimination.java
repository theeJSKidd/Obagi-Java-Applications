import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int count = 0;
        
        while (count < 5) {
            System.out.printf("Enter number %d (10-100): ", count + 1);
            int num = input.nextInt();
            
            if (num < 10 || num > 100) {
                System.out.println("Number must be between 10 and 100. Try again.");
                continue;
            }
            
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                numbers[count] = num;
                count++;
                
                System.out.print("Unique values: ");
                for (int i = 0; i < count; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("Duplicate number. Try again.");
            }
        }
    }
}
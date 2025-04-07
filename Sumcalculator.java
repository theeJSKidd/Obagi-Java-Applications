import java.util.Scanner;

public class Sumcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter num%d: ", i + 1);
            numbers[i] = input.nextInt();
        }

        int sum6_9 = 0;
        for (int i = 5; i <= 8; i++) {
            sum6_9 += numbers[i];
        }

        int sum4_10 = 0;
        for (int i = 3; i <= 9; i++) {
            sum4_10 += numbers[i];
        }

        int result = sum4_10 - sum6_9;

        System.out.printf("Sum of numbers 6-9: %d%n", sum6_9);
        System.out.printf("Sum of numbers 4-10: %d%n", sum4_10);
        System.out.printf("Result (Sum 4-10 - Sum 6-9): %d%n", result);
    }
}


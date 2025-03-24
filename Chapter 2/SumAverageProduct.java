import java.util.Scanner;
//2.17
public class SumAverageProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int product = num1 * num2 * num3;
        int average = sum / 3;

        System.out.printf("Sum: %d%nAverage: %d%nProduct: %d%n", sum, average, product);
    }
}

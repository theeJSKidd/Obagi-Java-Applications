import java.util.Scanner;
//2.24
public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        int largest = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
        int smallest = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, num5))));

        System.out.printf("Largest: %d%nSmallest: %d%n", largest, smallest);
    }
}

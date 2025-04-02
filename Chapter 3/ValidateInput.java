import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;

        do {
            System.out.print("Enter 1 or 2: ");
            userInput = input.nextInt();
        } while (userInput != 1 && userInput != 2);

        System.out.println("Valid input received: " + userInput);
    }
}

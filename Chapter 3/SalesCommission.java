import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSales = 0;
        
        while (true) {
            System.out.print("Enter item price (0 to stop): ");
            double price = input.nextDouble();
            if (price == 0) break;
            totalSales += price;
        }
        
        double earnings = 200 + 0.09 * totalSales;
        System.out.printf("Total earnings: $%.2f%n", earnings);
    }
}

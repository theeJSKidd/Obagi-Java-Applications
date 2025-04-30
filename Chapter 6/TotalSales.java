import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] sales = new double[5][4]; // products x salespeople
        
        System.out.println("Enter sales slips (salesperson product amount), -1 to end:");
        while (true) {
            System.out.print("Enter salesperson (1-4), product (1-5), amount: ");
            int salesperson = input.nextInt();
            if (salesperson == -1) break;
            int product = input.nextInt();
            double amount = input.nextDouble();
            
            sales[product - 1][salesperson - 1] += amount;
        }
        
        // Display header
        System.out.printf("%10s%10s%10s%10s%10s%10s%n", 
            "Product", "Sales 1", "Sales 2", "Sales 3", "Sales 4", "Total");
        
        double[] salespersonTotal = new double[4];
        double grandTotal = 0;
        
        for (int product = 0; product < 5; product++) {
            double productTotal = 0;
            System.out.printf("%10d", product + 1);
            
            for (int person = 0; person < 4; person++) {
                System.out.printf("%10.2f", sales[product][person]);
                productTotal += sales[product][person];
                salespersonTotal[person] += sales[product][person];
            }
            
            System.out.printf("%10.2f%n", productTotal);
            grandTotal += productTotal;
        }
        
        // Display salesperson totals
        System.out.printf("%10s", "Total");
        for (int person = 0; person < 4; person++) {
            System.out.printf("%10.2f", salespersonTotal[person]);
        }
        System.out.printf("%10.2f%n", grandTotal);
    }
}
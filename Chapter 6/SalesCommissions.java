import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] salaryRanges = new int[9]; // Index 0: 200-299, 1: 300-399, ..., 8: 1000+
        
        System.out.print("Enter number of salespeople: ");
        int numSalespeople = input.nextInt();
        
        for (int i = 0; i < numSalespeople; i++) {
            System.out.printf("Enter gross sales for salesperson %d: $", i + 1);
            double grossSales = input.nextDouble();
            int salary = (int) (200 + 0.09 * grossSales);
            
            if (salary >= 1000) {
                salaryRanges[8]++;
            } else {
                int index = (salary / 100) - 2;
                salaryRanges[index]++;
            }
        }
        
        // Display results
        System.out.println("\nSalary Range\tNumber of Salespeople");
        System.out.println("$200-299\t" + salaryRanges[0]);
        System.out.println("$300-399\t" + salaryRanges[1]);
        System.out.println("$400-499\t" + salaryRanges[2]);
        System.out.println("$500-599\t" + salaryRanges[3]);
        System.out.println("$600-699\t" + salaryRanges[4]);
        System.out.println("$700-799\t" + salaryRanges[5]);
        System.out.println("$800-899\t" + salaryRanges[6]);
        System.out.println("$900-999\t" + salaryRanges[7]);
        System.out.println("$1000 and over\t" + salaryRanges[8]);
    }
}
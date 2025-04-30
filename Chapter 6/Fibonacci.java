import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
        
        // Part b: Find largest Fibonacci number that can be displayed
        findMaxIntFibonacci();
        
        // Part c: Using double
        System.out.println("\nUsing double:");
        findMaxDoubleFibonacci();
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void findMaxIntFibonacci() {
        int a = 0, b = 1, c;
        int count = 0;
        
        System.out.println("\nFibonacci numbers with int:");
        while (true) {
            if (count % 10 == 0) System.out.println();
            
            System.out.print(a + " ");
            
            try {
                c = Math.addExact(a, b);
                a = b;
                b = c;
                count++;
            } catch (ArithmeticException e) {
                System.out.println("\nMaximum Fibonacci number with int: " + b);
                System.out.println("At position: " + count);
                break;
            }
        }
    }
    
    public static void findMaxDoubleFibonacci() {
        double a = 0, b = 1, c;
        int count = 0;
        
        System.out.println("\nFibonacci numbers with double:");
        while (count < 1000) { // Prevent infinite loop
            if (count % 10 == 0) System.out.println();
            
            System.out.printf("%.0f ", a);
            
            c = a + b;
            if (Double.isInfinite(c)) {
                System.out.println("\nMaximum Fibonacci number with double: " + b);
                System.out.println("At position: " + count);
                break;
            }
            
            a = b;
            b = c;
            count++;
        }
    }
}
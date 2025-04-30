public class SieveOfEratosthenes {
    public static void main(String[] args) {
        boolean[] primes = new boolean[1000];
        
        // Initialize all elements to true
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }
        
        // Apply Sieve of Eratosthenes
        for (int i = 2; i < Math.sqrt(primes.length); i++) {
            if (primes[i]) {
                for (int j = i * i; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }
        }
        
        // Display prime numbers
        System.out.println("Prime numbers between 2 and 999:");
        int count = 0;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\nTotal primes found: " + count);
    }
}
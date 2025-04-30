import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random random = new Random();
        int[] frequency = new int[13]; // Indices 0-12 (we'll use 2-12)
        
        for (int i = 0; i < 36_000_000; i++) {
            int die1 = 1 + random.nextInt(6);
            int die2 = 1 + random.nextInt(6);
            int sum = die1 + die2;
            frequency[sum]++;
        }
        
        System.out.printf("%4s%12s%n", "Sum", "Frequency");
        for (int sum = 2; sum < frequency.length; sum++) {
            System.out.printf("%4d%12d%n", sum, frequency[sum]);
        }
    }
}
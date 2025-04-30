import java.util.Random;

public class TortoiseAndHare {
    public static void main(String[] args) {
        Random random = new Random();
        int tortoise = 1;
        int hare = 1;
        
        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");
        
        while (true) {
            // Move tortoise
            int tortoiseMove = random.nextInt(10) + 1;
            if (tortoiseMove <= 5) { // Fast plod
                tortoise += 3;
            } else if (tortoiseMove <= 7) { // Slip
                tortoise = Math.max(1, tortoise - 6);
            } else { // Slow plod
                tortoise += 1;
            }
            
            // Move hare
            int hareMove = random.nextInt(10) + 1;
            if (hareMove <= 2) { // Sleep
                // No move
            } else if (hareMove <= 4) { // Big hop
                hare += 9;
            } else if (hareMove == 5) { // Big slip
                hare = Math.max(1, hare - 12);
            } else if (hareMove <= 8) { // Small hop
                hare += 1;
            } else { // Small slip
                hare = Math.max(1, hare - 2);
            }
            
            // Display positions
            for (int i = 1; i <= 70; i++) {
                if (i == tortoise && i == hare) {
                    System.out.print("OUCH!!!");
                    i += 6; // Skip next positions
                } else if (i == tortoise) {
                    System.out.print("T");
                } else if (i == hare) {
                    System.out.print("H");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
            // Check for winner
            if (tortoise >= 70 && hare >= 70) {
                System.out.println("It's a tie.");
                break;
            } else if (tortoise >= 70) {
                System.out.println("TORTOISE WINS!!! YAY!!!");
                break;
            } else if (hare >= 70) {
                System.out.println("Hare wins. Yuch.");
                break;
            }
        }
    }
}
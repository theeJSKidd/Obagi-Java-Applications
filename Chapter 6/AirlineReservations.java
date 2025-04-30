import java.util.Scanner;

public class AirlineReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[10]; // All false initially
        
        while (true) {
            System.out.println("Please type 1 for First Class");
            System.out.println("Please type 2 for Economy");
            System.out.print("Choice: ");
            int choice = input.nextInt();
            
            int seatNumber = -1;
            boolean sectionFull = false;
            
            if (choice == 1) {
                seatNumber = assignSeat(seats, 0, 4);
                if (seatNumber == -1) {
                    System.out.println("First Class is full. Would you like Economy? (1=Yes, 2=No)");
                    int accept = input.nextInt();
                    if (accept == 1) {
                        seatNumber = assignSeat(seats, 5, 9);
                        sectionFull = seatNumber == -1;
                    }
                }
            } else if (choice == 2) {
                seatNumber = assignSeat(seats, 5, 9);
                if (seatNumber == -1) {
                    System.out.println("Economy is full. Would you like First Class? (1=Yes, 2=No)");
                    int accept = input.nextInt();
                    if (accept == 1) {
                        seatNumber = assignSeat(seats, 0, 4);
                        sectionFull = seatNumber == -1;
                    }
                }
            }
            
            if (sectionFull) {
                System.out.println("Next flight leaves in 3 hours.");
                break;
            }
            
            if (seatNumber != -1) {
                System.out.println("Boarding pass for seat " + (seatNumber + 1));
                System.out.println("Section: " + (seatNumber < 5 ? "First Class" : "Economy"));
            }
            
            System.out.println();
        }
    }
    
    private static int assignSeat(boolean[] seats, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (!seats[i]) {
                seats[i] = true;
                return i;
            }
        }
        return -1;
    }
}
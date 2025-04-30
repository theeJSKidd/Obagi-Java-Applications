public class TurtleGraphics {
    private static final int SIZE = 20;
    private static int[][] floor = new int[SIZE][SIZE];
    private static int x = 0, y = 0;
    private static boolean penDown = false;
    private static int direction = 0; // 0=right, 1=down, 2=left, 3=up
    
    public static void main(String[] args) {
        int[] commands = {2, 5,12, 3, 5,12, 3, 5,12, 3, 5,12, 1, 6, 9};
        
        for (int cmd : commands) {
            processCommand(cmd);
        }
    }
    
    private static void processCommand(int command) {
        switch (command) {
            case 1: // Pen up
                penDown = false;
                break;
            case 2: // Pen down
                penDown = true;
                break;
            case 3: // Turn right
                direction = (direction + 1) % 4;
                break;
            case 4: // Turn left
                direction = (direction + 3) % 4;
                break;
            case 5: // Move forward n spaces
                // In a real implementation, we'd read the next command for n
                break;
            case 6: // Display floor
                displayFloor();
                break;
            case 9: // End of data
                break;
        }
    }
    
    private static void displayFloor() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(floor[i][j] == 1 ? "*" : " ");
            }
            System.out.println();
        }
    }
}
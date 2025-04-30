public class KnightsTour {
    private static final int SIZE = 8;
    private static int[][] board = new int[SIZE][SIZE];
    private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    
    public static void main(String[] args) {
        int currentRow = 0;
        int currentCol = 0;
        board[currentRow][currentCol] = 1;
        
        for (int move = 2; move <= 64; move++) {
            int nextRow = -1;
            int nextCol = -1;
            int minAccessibility = 9;
            
            for (int i = 0; i < 8; i++) {
                int testRow = currentRow + vertical[i];
                int testCol = currentCol + horizontal[i];
                
                if (isValid(testRow, testCol) && board[testRow][testCol] == 0) {
                    int accessibility = calculateAccessibility(testRow, testCol);
                    if (accessibility < minAccessibility) {
                        minAccessibility = accessibility;
                        nextRow = testRow;
                        nextCol = testCol;
                    }
                }
            }
            
            if (nextRow == -1) {
                System.out.println("Tour ended at move " + (move - 1));
                break;
            }
            
            currentRow = nextRow;
            currentCol = nextCol;
            board[currentRow][currentCol] = move;
        }
        
        printBoard();
    }
    
    private static boolean isValid(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE;
    }
    
    private static int calculateAccessibility(int row, int col) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int testRow = row + vertical[i];
            int testCol = col + horizontal[i];
            if (isValid(testRow, testCol) && board[testRow][testCol] == 0) {
                count++;
            }
        }
        return count;
    }
    
    private static void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.printf("%3d", cell);
            }
            System.out.println();
        }
    }
}
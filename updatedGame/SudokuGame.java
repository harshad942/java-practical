import java.util.Random;
import java.util.Scanner;
public class SudokuGame {
    private int size;
    private int[][] grid;
    private Random random;
    private Scanner scanner;

    SudokuGame(int size) {
        this.size = size;
        this.grid = new int[size][size];
        this.random = new Random();
        this.scanner = new Scanner(System.in);

        generateGrid();  
        removeNumbers(); 
        playGame();   
        checkSudoku(); 
    }

    private void generateGrid() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                int num;
                do {
                    num = random.nextInt(size) + 1;
                } while (!isValid(num, row, col));
                grid[row][col] = num;
            }
        }
    }

    private boolean isValid(int num, int row, int col) {
        for (int i = 0; i < size; i++) {
            if (grid[row][i] == num || grid[i][col] == num) {
                return false;
            }
        }
        return true;
    }
    private void removeNumbers() {
        int totalCells = size*size;
        int removeCount = (int)(totalCells * 0.6);
        int removed = 0;

        while (removed < removeCount) {
            int row = random.nextInt(size);
            int col = random.nextInt(size);
            if (grid[row][col] != 0) { 
                grid[row][col] = 0;
                removed++;
            }
        }
    }
    private void playGame() {
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if (grid[i][j] == 0) { 
                printGrid();
                System.out.print("Enter number for row " + (i + 1) + ", column " + (j + 1) + ": ");
                grid[i][j] = scanner.nextInt();
            }
        }
    }
    System.out.println("\nSudoku Completed!");
    printGrid();
    checkSudoku();
    }
    private boolean isComplete() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (grid[row][col] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private void checkSudoku() {
        if (isSudokuValid()) {
            System.out.println("Congratulations! YOU WON");
        } else {
            System.out.println("Sorry failed! Try Again");
        }
    }

    private boolean isSudokuValid() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                int num = grid[row][col];
                grid[row][col] = 0; 
                if (!isValid(num, row, col)) {
                    return false;
                }
                grid[row][col] = num;
            }
        }
        return true;
    }
    private void printGrid() {
        System.out.println("Sudoku Grid:");
        for (int i = 0; i < size; i++) {
            for (int j=0;j<size;j++){
                System.out.print(grid[i][j] == 0?"  ":grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of sudoku : ");
        int size = sc.nextInt();
       SudokuGame sg = new SudokuGame(size);

    }
}

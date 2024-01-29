public class Main {

    public static void main(String[] args) {
        int[][] unsolvedSudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (SudokuSolver.solveSudoku(unsolvedSudoku)) {
            System.out.println("Sudoku Solved:");
            printSudoku(unsolvedSudoku);
        } else 
            System.out.println("No solution exists.");
    }

    private static void printSudoku(int[][] board) {
        for (int[] row : board) {
            for (int num : row) 
                System.out.print(num + " ");
            System.out.println();
        }
    }
}


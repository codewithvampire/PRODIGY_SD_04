public class SudokuSolver {

    public static boolean solveSudoku(int[][] board) {
        int[] emptyLoc = findEmptyLocation(board);

        if (emptyLoc == null) 
            return true;

        int row = emptyLoc[0];
        int col = emptyLoc[1];

        for (int num = 1; num <= 9; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;

                if (solveSudoku(board)) 
                    return true;

                board[row][col] = 0;
            }
        }

        return false;
    }

    private static boolean isValid(int[][] board, int row, int col, int num) {
        for (int i = 0; i < 9; i++) 
            if (board[row][i] == num || board[i][col] == num ||
                board[row - row % 3 + i / 3][col - col % 3 + i % 3] == num) {
                return false;
            }
        return true;
    }

    private static int[] findEmptyLocation(int[][] board) {
        for (int i = 0; i < 9; i++) 
            for (int j = 0; j < 9; j++) 
                if (board[i][j] == 0) 
                    return new int[]{i, j};
        return null;
    }
}

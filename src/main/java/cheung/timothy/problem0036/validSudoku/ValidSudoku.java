package cheung.timothy.problem0036.validSudoku;

public class ValidSudoku {

    private static final int BOARD_SIZE = 9;
    private static final int SUB_BOX_SIZE = 3;
    private static final int CHAR_OFFSET = 49;
    private static final char EMPTY = '.';

    public boolean isValidSudoku(char[][] board) {
        return rowsValid(board) && columnsValid(board) && subBoxesValid(board);
    }

    private boolean rowsValid(char[][] board) {
        for (int y = 0; y < BOARD_SIZE; y++) {
            int[] present = new int[BOARD_SIZE];
            for (int x = 0; x < BOARD_SIZE; x++) {
                if (board[y][x] == EMPTY) {
                    continue;
                }
                int idx = board[y][x] - CHAR_OFFSET;
                present[idx]++;
                if (idx != -1 && present[idx] > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean columnsValid(char[][] board) {
        for (int x = 0; x < BOARD_SIZE; x++) {
            int[] present = new int[BOARD_SIZE];
            for (int y = 0; y < BOARD_SIZE; y++) {
                if (board[y][x] == EMPTY) {
                    continue;
                }
                int idx = board[y][x] - CHAR_OFFSET;
                present[idx]++;
                if (idx != -1 && present[idx] > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean subBoxesValid(char[][] board) {
        int xOffset = 0;
        int yOffset = 0;
        for (int i = 0; i < SUB_BOX_SIZE; i++) {
            for (int j = 0; j < SUB_BOX_SIZE; j++) {
                if (!subBoxValid(board, i * SUB_BOX_SIZE, j * SUB_BOX_SIZE)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean subBoxValid(char[][] board, int xOffset, int yOffset) {
        int[] present = new int[BOARD_SIZE];
        for (int i = 0; i < SUB_BOX_SIZE; i++) {
            for (int j = 0; j < SUB_BOX_SIZE; j++) {
                int x = i + xOffset;
                int y= j + yOffset;
                if (board[y][x] == EMPTY) {
                    continue;
                }
                int idx = board[y][x] - CHAR_OFFSET;
                present[idx]++;
                if (idx != -1 && present[idx] > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}

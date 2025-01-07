package parttwo;

public class Board {
    // Instance variables
    private char[][] board;
    private final int SIZE;
    private static final char EMPTY = ' ';

    /**
     * Constructor for the Board class. Initializes the board with empty spaces.
     */
    public Board(int SIZE) {
        this.SIZE = SIZE;
        board = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }
    /**
     * Displays the current state of the board.
     */
    public void displayBoard() {
        StringBuilder rowDivider = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            rowDivider.append("---");
            if (i < SIZE - 1) {
                rowDivider.append("+");
            }
        }
        // Dynamically create the board based on the size
        for (int i = 0; i < SIZE; i++) {
            StringBuilder rowContent = new StringBuilder();
            for (int j = 0; j < SIZE; j++) {
                rowContent.append(String.format(" %c ", board[i][j]));
                if (j < SIZE - 1) {
                    rowContent.append("|");
                }
            }
            System.out.println(rowContent);
            if (i < SIZE - 1) {
                System.out.println(rowDivider);
            }
        }
    }

    /**
     * Makes a move on the board at the specified row and column. Returns true if the move is valid, false otherwise.
     * @param row
     * @param col
     * @param player
     * @return true if the move is valid, false otherwise
     */
    public boolean makeMove(int row, int col, char player) {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE || board[row][col] != EMPTY) {
            return false;
        }
        board[row][col] = player;
        return true;
    }
    /**
     * Checks if the specified player has won the game.
     * @param player
     * @return true if the player has won, false otherwise
     */
    public boolean checkWin(char player) {
        // Check rows
        for (int i = 0; i < SIZE; i++) {
            boolean win = true;
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] != player) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // Check columns
        for (int i = 0; i < SIZE; i++) {
            boolean win = true;
            for (int j = 0; j < SIZE; j++) {
                if (board[j][i] != player) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // Check main diagonal
        boolean win = true;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][i] != player) {
                win = false;
                break;
            }
        }
        if (win) return true;

        // Check anti-diagonal
        win = true;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][SIZE - 1 - i] != player) {
                win = false;
                break;
            }
        }
        if (win) return true;

        return false;
    }
    /**
     * Returns the character at the specified row and column.
     * @param row
     * @param col
     * @return the character at the specified row and column
     */
    public char getPosition(int row, int col) {
        return board[row][col];
    }
    /**
     * Checks if the game is a draw.
     * @return true if the game is a draw, false otherwise
     */
    public boolean isDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Resets the board to its initial state.
     */
    public void reset() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }
    /**
     * Returns the size of the board.
     * @return the size of the board
     */
    public int getSize() {
        return SIZE;
    }
    
    /**
     * Returns the board as a 2D character array.
     * @return the board as a 2D character array
     */
    public char[][] getBoard() {
        return board;
    }
}
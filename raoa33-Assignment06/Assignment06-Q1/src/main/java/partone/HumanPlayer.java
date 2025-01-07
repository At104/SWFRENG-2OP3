package partone;

import java.util.Scanner;

public class HumanPlayer extends Player {
    // Instance variable
    private Scanner scanner;
    /**
     * Constructor to initialize the name, symbol and scanner.
     * @param name
     * @param symbol
     * @param scanner
     */
    public HumanPlayer(String name, char symbol, Scanner scanner) {
        super(name, symbol);
        this.scanner = scanner;
    }
    /**
     * Get the move from the human player.
     * @param board The current board
     * @return The move of the human player
     */
    @Override
    public int[] getMove(Board board) {
        System.out.printf("Enter row and column (1-%d) separated by a space: ", board.getSize());
        int row = scanner.nextInt() - 1; // Subtract 1 to convert to 0-based index
        int col = scanner.nextInt() - 1;
        return new int[]{row, col};
    }
}
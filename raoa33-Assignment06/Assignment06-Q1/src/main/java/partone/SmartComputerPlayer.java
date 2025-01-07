package partone;

public class SmartComputerPlayer extends Player {
    public SmartComputerPlayer(String name, char symbol) {
        super(name, symbol);
    }

   /**
    * This method is used to get the move of the computer player.
    * The computer player will try to win the game if possible, block the opponent if necessary,
    * take the center if available, take a corner if available, or take any available position.
    * @param board The current board
    * @return The move of the smart computer player
    */
    @Override
    public int[] getMove(Board board) {
        // If the computer can win, do so
        int[] move = checkWinningMove(board, getSymbol());
        if (move != null) {
            return move;
        }

        // If the computer can block the opponent, do so
        char opponentSymbol = (getSymbol() == 'X') ? 'O' : 'X';
        move = checkWinningMove(board, opponentSymbol);
        if (move != null) {
            return move;
        }

        // If the computer can take the center, do so
        move = checkCenter(board);
        if (move != null) {
            return move;
        }

        // If the computer can take a corner, do so
        move = checkCorners(board);
        if (move != null) {
            return move;
        }

        // Otherwise, take any available position
        for (int row = 0; row < board.getSize(); row++) {
            for (int col = 0; col < board.getSize(); col++) {
                if (board.getPosition(row, col) == ' ') {
                    return new int[]{row, col};
                }
            }
        }

        return null; // No move found (base case), should not reach here
    }

    /**
     * This method is used to check if the computer player can make a winning move, or block the opponent if they can win.
     * @param board
     * @param symbol
     * @return The winning move if found, null otherwise
     */
    public int[] checkWinningMove(Board board, char symbol) {
        int size = board.getSize();
        int count = 0;
        int emptyCount = 0;
        int claimRow = 0;
        int claimCol = 0;

        // Check rows
        for (int row = 0; row < size; row++) {
            count = 0;
            emptyCount = 0;
            for (int col = 0; col < size; col++) {
                if (board.getPosition(row, col) == symbol) {
                    count++;
                } else if (board.getPosition(row, col) == ' ') {
                    emptyCount++;
                    claimRow = row;
                    claimCol = col;
                }
            }
            if (count == size - 1 && emptyCount == 1) {
                return new int[]{claimRow, claimCol};
            }
        }

        // Check columns
        for (int col = 0; col < size; col++) {
            count = 0;
            emptyCount = 0;
            for (int row = 0; row < size; row++) {
                if (board.getPosition(row, col) == symbol) {
                    count++;
                } else if (board.getPosition(row, col) == ' ') {
                    emptyCount++;
                    claimRow = row;
                    claimCol = col;
                }
            }
            if (count == size - 1 && emptyCount == 1) {
                return new int[]{claimRow, claimCol};
            }
        }

        // Check left diagonal
        count = 0;
        emptyCount = 0;
        for (int i = 0; i < size; i++) {
            if (board.getPosition(i, i) == symbol) {
                count++;
            } else if (board.getPosition(i, i) == ' ') {
                emptyCount++;
                claimRow = i;
                claimCol = i;
            }
        }
        if (count == size - 1 && emptyCount == 1) {
            return new int[]{claimRow, claimCol};
        }

        // Check right diagonal
        count = 0;
        emptyCount = 0;
        for (int i = 0; i < size; i++) {
            if (board.getPosition(i, size - 1 - i) == symbol) {
                count++;
            } else if (board.getPosition(i, size - 1 - i) == ' ') {
                emptyCount++;
                claimRow = i;
                claimCol = size - 1 - i;
            }
        }
        if (count == size - 1 && emptyCount == 1) {
            return new int[]{claimRow, claimCol};
        }

        return null; // No winning move found
    }
    /**
     * This method is used to check if the center is available.
     * @param board
     * @return The center position if available, null otherwise
     */
    public int[] checkCenter(Board board) {
        int size = board.getSize();
        int centerRow = size / 2;
        int centerCol = size / 2;

        if (board.getPosition(centerRow, centerCol) == ' ') {
            return new int[]{centerRow, centerCol};
        }
        return null;
    }
    /**
     * This method is used to check if any corner is available.
     * @param board
     * @return The corner position if available, null otherwise
     */
    public int[] checkCorners(Board board) {
        int size = board.getSize();
        int[][] corners = new int[][]{{0, 0}, {0, size - 1}, {size - 1, 0}, {size - 1, size - 1}};
        for (int[] corner : corners) {
            if (board.getPosition(corner[0], corner[1]) == ' ') {
                return corner;
            }
        }
        return null;
    }
}
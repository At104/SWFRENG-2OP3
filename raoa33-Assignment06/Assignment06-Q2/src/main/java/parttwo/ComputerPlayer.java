package parttwo;

import java.util.Random;

public class ComputerPlayer extends Player {
    private Random random;

    public ComputerPlayer(String name, char symbol) {
        super(name, symbol);
        this.random = new Random();
    }
    /**
     * Get a random move from the computer player.
     * @param board The current board
     * @return The move of the computer player
     */
    @Override
    public int[] getMove(Board board) {
        int row, col;
        do {
            row = random.nextInt(board.getSize());
            col = random.nextInt(board.getSize());
        } while (board.getPosition(row, col) != ' ');
        return new int[]{row, col};
    }
}
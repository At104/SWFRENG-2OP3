package parttwo;

public class UpgradedGame extends Game {
   

    /**
     * Overridden method to make the board. The size of the board is taken as input from the user
     * @return The board
     */
    @Override
    public Board makeBoard() {
        System.out.println("Enter the size of the board (3<=N<=20): ");
        int size = scanner.nextInt();
        while (size < 3 || size > 20) {
            System.out.println("Invalid size. Please enter a size between 3 and 20 inclusive.");
            size = scanner.nextInt();
        }

        return new Board(size);
    }
    
}

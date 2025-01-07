package parttwo;

public abstract class Player {
    // Instance variables
    protected String name;
    protected char symbol;
    /**
     * Constructor to initialize the name and symbol.
     * @param name
     * @param symbol
     */
    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    /**
     * Get the name of the player.
     * @return The name of the player
     */
    public String getName() {
        return name;
    }
    /**
     * Get the symbol of the player.
     * @return The symbol of the player (X or O)
     */
    public char getSymbol() {
        return symbol;
    }
    /**
     * Set the name of the player.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Set the symbol of the player.
     * @param symbol
     */
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    /**
     * Get the move of the player. Abstract method to be implemented by subclasses.
     * @param board The current board
     * @return The move of the player
     */
    public abstract int[] getMove(Board board);
}
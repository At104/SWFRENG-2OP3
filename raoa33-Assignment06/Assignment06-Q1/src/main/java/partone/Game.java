package partone;

import java.util.Scanner;

public class Game {
    // Instance variables
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    public static Scanner scanner = new Scanner(System.in); // Scanner to read user input

    /**
     * Constructor to set up the game.
     */
    public Game() {
    }
    /**
     * Starts the game by displaying the welcome message and asking the user to choose the game mode.
     */
    private void startGame() {
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Choose the game mode:");
        System.out.println("1. Human vs Human");
        System.out.println("2. Human vs Smart Computer");
        System.out.println("3. Smart Computer vs Smart Computer");


        int choice = scanner.nextInt();
        while (choice != 1 && choice != 2 && choice != 3) {
            System.out.println("Invalid choice. Please enter 1,2 or 3.");
            choice = scanner.nextInt();
        }

        if (choice == 1) {
            System.out.print("Enter the name of Player 1: ");
            String name = scanner.next();
            player1 = new HumanPlayer(name, 'X', scanner);
            System.out.print("Enter the name of Player 2: ");
            name = scanner.next();
            player2 = new HumanPlayer(name, 'O', scanner);
        } 
        else if (choice == 2) {
            System.out.print("Enter the name of Player 1: ");
            String name = scanner.next();
            player1 = new HumanPlayer(name, 'X', scanner);
            player2 = new SmartComputerPlayer("SmartComputer", 'O');
        }
        else {
            player1 = new SmartComputerPlayer("Smart Computer 1", 'X');
            player2 = new SmartComputerPlayer("Smart Computer 2", 'O');
        }

        this.currentPlayer = player1;
        this.board = makeBoard();
    }

    /**
     * Switches the current player.
     */
    public void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public Board makeBoard() {
        return new Board(3);
    }
    /**
     * Asks the user if they want to play again after the game has ended.
     */
    private void playAgain() {
        System.out.println("Do you want to play again? (Y/n)");
        String response = scanner.next().trim().toLowerCase();
        if (response.equals("y")) {
            board.reset();
            play();
        } 
        else {
            scanner.close();
            System.out.println("Thanks for playing!");
        }
    }
    /**
     * This method is used to play the game.
     * It displays the board, asks the current player for a move, and checks if the game has been won or is a draw.
     * Loops until the game is won or a draw occurs.
     */
    public void play() {
        // Initialize the game
        boolean gameWon = false;
        boolean draw = false;
        startGame();

        // Main game loop
        while (!gameWon && !draw) {
            board.displayBoard();
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + ")");
            int[] move = currentPlayer.getMove(board);
            int row = move[0];
            int col = move[1];

            if (board.makeMove(row, col, currentPlayer.getSymbol())) {
                gameWon = board.checkWin(currentPlayer.getSymbol());
                draw = board.isDraw();
                if (!gameWon) {
                    switchPlayer();
                }
            } 
            else {
                System.out.println("Invalid move. Try again.");
            }
        }
        // Display the final state of the board, and the result of the game
        board.displayBoard();
        if (gameWon) {
            System.out.println("Congratulations " + currentPlayer.getName() + "! You have won.");
        } 
        else if (draw) {
            System.out.println("The game is a draw.");
        }
        // Ask the user if they want to play again
        playAgain();
    }

    
}
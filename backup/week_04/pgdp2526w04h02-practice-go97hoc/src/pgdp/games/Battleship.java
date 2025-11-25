package pgdp.games;

import static pgdp.PinguLib.*;

public class Battleship {

    private static final String WELCOME_MESSAGE = "Welcome to Battleships";
    private static final String PLAY_MESSAGE = "Let's start the game!";
    private static final String WIN_MESSAGE = "Congrats! You won!";
    private static final String LOSE_MESSAGE = "Too bad, you lost!";

    private static final String PRINT_FIRST_LINE = "Your Board:\t\t\tAI Board:";
    private static final String PRINT_SECOND_LINE = "+ a b c d e f g h\t\t+ a b c d e f g h";
    private static final String TABS = "\t\t";

    private static final String PLAYER_BOAT = " ■";
    private static final String BOAT_MISSED = " o";
    private static final String BOAT_HIT = " x";
    private static final String WATER = "  ";

    public static final int EMPTY = 0;
    public static final int BOAT = 1;
    public static final int MISSED = 2;
    public static final int HIT = 3;

    private Player player;
    private AI ai;

    public Battleship(Player player, AI ai) {
        this.player = player;
        this.ai = ai;
    }

    public static void main(String[] args) {
        new Battleship(new Player(), new AI()).game();
    }

    /**
     * Runs the whole game.
     */
    public void game() {
        // TODO 7



            write(WELCOME_MESSAGE);


            printBoard(new int[8][8], new int[8][8]);


            player.generatePlayerBoard();


            write(PLAY_MESSAGE);

            int[][] playerBoard = player.getBoard();
            int[][] aiBoard = ai.getBoard();


            while (hasShipsLeft(playerBoard) && hasShipsLeft(aiBoard)) {


                while (hasShipsLeft(aiBoard)) {
                    boolean hit = player.play(aiBoard);
                    printBoard(playerBoard, aiBoard);
                    if (!hit) break;
                }


                if (!hasShipsLeft(aiBoard)) break;


                while (hasShipsLeft(playerBoard)) {
                    boolean hit = ai.play(playerBoard);
                    printBoard(playerBoard, aiBoard);
                    if (!hit) break;
                }


                if (!hasShipsLeft(playerBoard)) break;
            }


            if (!hasShipsLeft(aiBoard)) {
                write(WIN_MESSAGE);
            } else {
                write(LOSE_MESSAGE);
            }
        }



    /**
     * Checks if there are any ships left.
     *
     * @param board
     * @return true if at least one ship exists (partially)
     */
    public boolean hasShipsLeft(int[][] board) {
        // TODO 2
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 1) {
                    return true;
                }

            }

        }
return false;

    }
    /**
     * Prints both boards to the console
     *
     * @param playerBoard
     * @param aiBoard
     */
    public static void printBoard(int[][] playerBoard, int[][] aiBoard) {
        // TODO 1
        System.out.println(PRINT_FIRST_LINE);
        System.out.println(PRINT_SECOND_LINE);
        for (int i = 0; i < 8; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < 8; j++) {
                switch (playerBoard[i][j]) {
                    case EMPTY -> System.out.print(WATER);
                    case BOAT -> System.out.print(PLAYER_BOAT);
                    case MISSED -> System.out.print(BOAT_MISSED);
                    case HIT -> System.out.print(BOAT_HIT);
                }}
                System.out.print(TABS);
                System.out.print((i + 1));
            for (int j = 0; j < 8; j++) {
                if (aiBoard[i][j] == EMPTY || aiBoard[i][j] == BOAT) {
                    System.out.print(WATER);
                } else if (aiBoard[i][j] == MISSED) {
                    System.out.print(BOAT_MISSED);
                } else {
                    System.out.print(BOAT_HIT);
                }
            }
            System.out.println();
        }


    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public AI getAi() {
        return ai;
    }

    public void setAi(AI ai) {
        this.ai = ai;
    }
}

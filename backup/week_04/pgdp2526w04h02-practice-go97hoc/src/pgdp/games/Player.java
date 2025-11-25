package pgdp.games;

import static pgdp.PinguLib.*;

public class Player {

    private static final String PLACE_LENGTH_4 = "Place a ship of length 4. Enter the coordinates of both ends.";
    private static final String PLACE_LENGTH_3 = "Place a ship of length 3.";
    private static final String PLACE_LENGTH_2 = "Place a ship of length 2.";
    private static final String PLACE_ERROR = "There is a problem with your coordinates. Try again!";

    private static final String ALREADY_HIT = "Field is already hit!";
    private static final String MISSED_MSG = "You missed. Better luck next time!";
    private static final String HIT_MSG = "You hit it!";


    private static final String ENTER_NUMBER = "Enter number coordinate:";
    private static final String ENTER_LETTER = "Enter letter coordinate:";

    private int[][] board;

    public Player() {
    }

    /**
     * Generates the player board with 1x ships of length 4, 2x ships of length 3
     * and 3x ships of length 2.
     */
    public void generatePlayerBoard() {
        // TODO 5
        board=new int[8][8];
        placeShip(4, PLACE_LENGTH_4);


        placeShip(3, PLACE_LENGTH_3);
        placeShip(3, PLACE_LENGTH_3);


        placeShip(2, PLACE_LENGTH_2);
        placeShip(2, PLACE_LENGTH_2);
        placeShip(2, PLACE_LENGTH_2);


    }

    /**
     * Places a ship of given length on the player board.
     *
     * @param length
     * @param message
     */
    public void placeShip(int length, String message) {
        // TODO 4
            while (true) {
                System.out.println(message);
                int row1 = readNumber();
                int col1 = readCharacter();
                int row2 = readNumber();
                int col2 = readCharacter();


                boolean horizontal = (row1 == row2);
                boolean vertical = (col1 == col2);

                if (!horizontal && !vertical) {
                    write(PLACE_ERROR);
                    continue;
                }

                int computedLength = horizontal ?
                        (col2 - col1 + 1) :
                        (row2 - row1 + 1);

                if (computedLength != length) {
                    write(PLACE_ERROR);
                    continue;
                }


                boolean ok = true;

                if (horizontal) {
                    for (int c = col1; c <= col2; c++) {
                        if (!checkCoordinate(row1, c)) {
                            ok = false;
                            break;
                        }
                    }
                } else {
                    for (int r = row1; r <= row2; r++) {
                        if (!checkCoordinate(r, col1)) {
                            ok = false;
                            break;
                        }
                    }
                }

                if (!ok) {
                    write(PLACE_ERROR);
                    continue;
                }

                setShip(row1, col1, row2, col2);
                Battleship.printBoard(board, new int[8][8]);
                break;
            }
        }



    /**
     * Sets the ship between the two given coordinates.
     *
     * @param row1
     * @param col1
     * @param row2
     * @param col2
     */
    public void setShip(int row1, int col1, int row2, int col2) {
        // TODO 3
        if (row1 == row2) {
            for (int col = col1; col <= col2; col++) {
                board[row1][col] =pgdp.games. Battleship.BOAT;
            }
        } else {
            for (int row = row1; row <= row2; row++) {
                board[row][col1] =pgdp.games.Battleship.BOAT;
            }
        }
    }

    /**
     * Checks the given coordinate if there are no adjacent ships around.
     *
     * @param row
     * @param col
     * @return true if it is not adjacent to any existing ship
     */
    public boolean checkCoordinate(int row, int col) {
        if (board[row][col] != 0 //
                || row + 1 < 8 && board[row + 1][col] != 0 //
                || col + 1 < 8 && board[row][col + 1] != 0 //
                || row - 1 >= 0 && board[row - 1][col] != 0 //
                || col - 1 >= 0 && board[row][col - 1] != 0) {
            return false;
        }
        return true;
    }

    /**
     * Plays one move of the player. Repeatedly asks the player to input coordinates
     * until they are valid
     *
     * @param aiBoard
     * @return true if the player hit a ship
     */
    public boolean play(int[][] aiBoard) {
        // TODO 6
        while (true) {
            int row = readNumber();
            int col = readCharacter();

            if (aiBoard[row][col] == Battleship.MISSED || aiBoard[row][col] ==Battleship.HIT) {
                write(ALREADY_HIT);
                continue;
            }
            if (aiBoard[row][col] ==Battleship.EMPTY) {
                write(Battleship.MISSED);
                aiBoard[row][col] =Battleship.MISSED;
                return false;
            }
            write(Battleship.HIT);
            aiBoard[row][col] =Battleship.HIT;
            return true;
        }
    }




    /**
     * Reads and returns a number between 1 and 8 (inclusive) from std-in.
     *
     * @return the number - 1
     */
    public static int readNumber() {
        int number = readInt(ENTER_NUMBER);
        while (number < 1 || number > 8) {
            number = readInt(ENTER_NUMBER);
        }
        return number - 1;
    }

    /**
     * Reads and returns a char between a and h (inclusive) from std-in.
     *
     * @return the char - 'a'
     */
    public static int readCharacter() {
        char character = readChar(ENTER_LETTER);
        while (character < 'a' || character > 'h') {
            character = readChar(ENTER_LETTER);
        }
        return character - 'a';
    }

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

}

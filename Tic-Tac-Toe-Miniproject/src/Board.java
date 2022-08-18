import java.util.Arrays;

public class Board {

    private final int MAX_ROWS;
    private final int MAX_COLUMNS;
    private Pieces[][] gameBoard;

    public Board(int maxRows, int maxColumns) {
        this.MAX_ROWS = maxRows;
        this.MAX_COLUMNS = maxColumns;
        gameBoard = new Pieces[MAX_ROWS][MAX_COLUMNS];
    }

    public int getMaxRows() {
        return MAX_ROWS;
    }

    public int getMaxColumns() {
        return MAX_COLUMNS;
    }

    public void printBoard() {

        for (int row = 0; row < MAX_ROWS; row++) {
            for (int col = 0; col < MAX_COLUMNS; col++) {
                if (gameBoard[row][col] == null) {
                    System.out.print("Z");
                } else {
                    System.out.print(gameBoard[row][col].getName());
                }
                
            }
            System.out.println();
        }

    }

    //method to check if one space in the board is free to a new play
    private boolean isSpaceFree(int row, int col) {
        if (row >= MAX_ROWS || col >= MAX_COLUMNS) {
            return false;
        }
        if (gameBoard[row][col] == null) {
            return true; //space free
        } else {
            return false;
        }
    }

    //to make a play, first check if there is space free
    public boolean play(char player, int row, int col) {

        if (isSpaceFree[row][col]) {
            gameBoard[row][col] = new Pieces(player, row, col);
            return true; //It is possible to make a play
        } else {
            return false;
        }

    }

    //defining autoplay
    public boolean autoPlay(char player) {
        boolean played = false;
        a:
        for (int row = 0; row < MAX_ROWS; row++) {
            for (int col = 0; col < MAX_COLUMNS; col++) {
                if (play(player, row, col)) {
                    played = true;
                    break a;
                }
            }
        }
        return played;
    }


    //have a winner
    public boolean haveAWinner() {
        boolean winner = false;

        //winner in rows
        for (int row = 0; row < MAX_ROWS; row++) {
            if (!Arrays.stream(gameBoard[row]).anyMatch(obj -> obj == null)) {
                winner = Arrays.stream(gameBoard[row])
                    .map(x -> x.getName())
                    .distinct().count() <= 1;

            }
        }

        //winner in columns
        if (!winner) {
            a:
            for (int col = 0; col < MAX_COLUMNS; col++) {
                Pieces[] column = new Pieces[MAX_ROWS];
                
                for (int row = 0; row < MAX_ROWS; row++) {
                    column[row] = gameBoard[row][col];
                }

                if (!Arrays.stream(column).anyMatch(obj -> obj == null)) {
                    winner = Arrays.stream(column).map(x -> x.getName()).distinct().count() <= 1;
                    if (winner) {
                        break a;
                    }
                }
            }
        }

        //winner in diagonals
        if (!winner) {
            Pieces[] diagonals = new Pieces[MAX_ROWS];
            for (int diag = 0; diag < MAX_ROWS; diag++) {
                diagonals[diag] = gameBoard[diag][diag];
            }
            if (!Arrays.stream(diagonals).anyMatch(obj -> obj == null)) {
                winner = Arrays.stream(diagonals).map(x -> x.getName()).distinct().count() <= 1;
            }
        }

        return winner;
    }

    //check if there is space available
    public boolean spaceAvailable() {
        return Arrays.stream(gameBoard).flatMap(x -> Arrays.stream(x)).anyMatch(obj -> obj == null);
    }


}

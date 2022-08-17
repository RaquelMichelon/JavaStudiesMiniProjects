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
}

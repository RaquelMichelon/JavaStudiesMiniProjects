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

    }
}

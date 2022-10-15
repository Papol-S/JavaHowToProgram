package Lesson7.Exercise7_22;

public class Board {
    private final int rowSize = 8;
    private final int columnSize = 8;
    private int[][] board = new int[rowSize][columnSize];


    public void displayBoard () {
        for (int[] row :board ) {
            for (int value : row) {
                System.out.printf("%d ",value);
            }
            System.out.println();
        }
    }

    public void boardStatusChange (int i , int j) {
        board[i][j] = 1;
    }

}

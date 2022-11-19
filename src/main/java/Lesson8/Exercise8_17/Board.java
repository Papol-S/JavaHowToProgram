package Lesson8.Exercise8_17;

import java.util.Arrays;

public class Board {
    private static int size = 3;

    private static enum Status {X,O,EMPTY};
    private static Status [][] board = new Status [size][size];

    private Player playerTest = new Player("Test1");
    private Player playerTest2 = new Player("Test2");

    public Board() {
        setBoard();
    }

    public void setBoard () {

        for (Status[] value:board) {
            Arrays.fill(value,Status.EMPTY);
        }
        playerTest.setPlayerPriority(0);
        playerTest2.setPlayerPriority(1);
    }

    public Status[][] getBoard() {
        return board;
    }

//    public void fillBoard (int row, int column, Player player) {
//        if (isEmpty(row, column)){
//            switch (player.getPlayerPriority()) {
//                case FIRST :
//                    board[row][column] = Status.X;
//                    break;
//            }
//            board[row][column] =
//        }
//    }

//    public void fillBoard (int row, int column,Player player) {
//        if (isEmpty(row, column)){
//            System.out.println(player.getPlayerPriority());
//            switch (player.getPlayerPriority()) {
//                case FIRST :
//                    board[row][column] = Status.X;
//                    break;
//                case SECOND:
//                    board[row][column] = Status.O;
//            }
//        }
//    }

    public void fillBoardTest () {
        board[0][1]=Status.X;
        board[1][1] = Status.O;
    }

    public boolean isEmpty (int row, int column) {
        return (board[row][column] == Status.EMPTY);
    }
    public void displayBoard () {
        for (Status[] value: board) {
            for (Status value2: value) {
                System.out.print(value2+" ");
            }
            System.out.println();
        }
    }
}

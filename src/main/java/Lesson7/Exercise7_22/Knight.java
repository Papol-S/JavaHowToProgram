package Lesson7.Exercise7_22;

public class Knight {


    private int[][][] checkBoundary =   {{{6,7},{5,6,7},{4,5,6},{4,5}},
                                         {{0,6,7},{0,5,6,7},{3,4,5,6},{3,4,5}},
                                         {{0,1,7},{0,1,2,7},{1,2,3,4},{2,3,4}},
                                         {{0,1},{0,1,2},{1,2,3},{2,3}}};

    private int currentRow;
    private int currentColumn;

    private int count = 0;

    private final int[] horizontalMove = {2,1,-1,-2,-2,-1,1,2};

    private final int[] verticalMove = {-1,-2,-2,-1,1,2,2,1};

    private int[][] pastPosition = new int[64][2];

    private int[] endpoint = new int[2];


    public void moveMent (int moveType) {

        switch (moveType) {
            case 0 :
                endpoint[0] = currentRow + verticalMove[0];
                endpoint[1] = currentColumn + horizontalMove[0];
                break;
            case 1 :
                currentRow += verticalMove[1];
                currentColumn += horizontalMove[1];
                break;
            case 2 :
                currentRow += verticalMove[2];
                currentColumn += horizontalMove[2];
                break;
            case 3 :
                currentRow += verticalMove[3];
                currentColumn += horizontalMove[3];
                break;
            case 4 :
                currentRow += verticalMove[4];
                currentColumn += horizontalMove[4];
                break;
            case 5 :
                currentRow += verticalMove[5];
                currentColumn += horizontalMove[5];
                break;
            case 6 :
                currentRow += verticalMove[6];
                currentColumn += horizontalMove[6];
                break;
            case 7 :
                currentRow += verticalMove[7];
                currentColumn += horizontalMove[7];
                break;
        }
    }

    public boolean inBoundaryUpRightDirection () {
        boolean inBoundary = false;

        return inBoundary;
    }

    public void reset() {

    }
}

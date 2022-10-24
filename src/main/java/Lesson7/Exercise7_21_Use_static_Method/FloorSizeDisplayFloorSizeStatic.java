package Lesson7.Exercise7_21_Use_static_Method;

import java.util.Arrays;

public class FloorSizeDisplayFloorSizeStatic {

    private static int rowSize  ;
    private static int columnSize  ;
    private static int [][] floor= new int[rowSize][columnSize];


    public int getRowSize() {
        return rowSize;
    }

    public static void setRowSize(int rowSize) {
        FloorSizeDisplayFloorSizeStatic.rowSize = rowSize;
    }

    public int getColumnSize() {
        return columnSize;
    }

    public static void setColumnSize(int columnSize) {
        FloorSizeDisplayFloorSizeStatic.columnSize = columnSize;
    }

    public static void displayFloor () {
        for (int [] values :floor) {
            for (int value:values) {
                System.out.printf("%d ",value);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void reset() {
        for (int [] row: floor) {
            Arrays.fill(row,0);
        }
    }

    public void floorChange (int i,int j) {

        floor[i][j] = 1;
    }
}

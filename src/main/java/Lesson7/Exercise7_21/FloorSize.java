package Lesson7.Exercise7_21;

import java.util.Arrays;

public class FloorSize {

    private int rowSize = 20;
    private int columnSize = 20;
    private int [][] floor= new int[rowSize][columnSize];


    public int[][] getFloor() {
        return floor;
    }

    public void setFloor(int[][] floor) {
        this.floor = floor;
    }

    public int getRowSize() {
        return rowSize;
    }

    public void setRowSize(int rowSize) {
        this.rowSize = rowSize;
    }

    public int getColumnSize() {
        return columnSize;
    }

    public void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }

    public void displayFloor () {
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

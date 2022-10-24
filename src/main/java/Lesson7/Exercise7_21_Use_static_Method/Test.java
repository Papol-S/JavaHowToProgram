package Lesson7.Exercise7_21_Use_static_Method;

public class Test {
    public static void main(String[] args) {
        FloorSizeDisplayFloorSizeStatic.setColumnSize(19);
        FloorSizeDisplayFloorSizeStatic.setRowSize(20);
        FloorSizeDisplayFloorSizeStatic.displayFloor();
        FloorSizeDisplayFloorSizeStatic floor = new FloorSizeDisplayFloorSizeStatic();
        System.out.println(floor.getColumnSize());
        FloorSizeDisplayFloorSizeStatic.displayFloor();
    }
}

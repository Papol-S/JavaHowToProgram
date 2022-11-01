package Lesson8.Exercise8_4;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.printf("Default area is %.2f\n",rectangle.areaCalc());
        try{
            rectangle.setLength(2);
            rectangle.setWidth(10);
            System.out.printf("Modified area is %.2f\n",rectangle.areaCalc());
            System.out.printf("Modified perimeter is %.2f\n",rectangle.perimeterCalc());
            System.out.println("--------After-----------");
            rectangle.setWidth(22); // try to input error value
        }
        catch (IllegalArgumentException e) {
            System.out.printf("%s\n",e);
        }
    }
}

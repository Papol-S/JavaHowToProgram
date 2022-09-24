package Lesson6.Exercise6_7;

public class MathTest {
    public static void main(String[] args) {
        double x = Math.abs(8.2);
        double y = Math.floor(9.6);
        double z = Math.abs(-9.2);
        double a = Math.ceil(2.1);
        double b = Math.abs(-7.8);
        double c = Math.ceil(-9.2);
        double d = Math.ceil( -Math.abs( -9.2 + Math.floor(-7.2)));

        System.out.printf("%.1f\n%.1f\n%.1f\n%.1f\n%.1f\n%.1f\n%.1f\n",x,y,z,a,b,c,d);
    }
}

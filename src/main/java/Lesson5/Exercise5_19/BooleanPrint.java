package Lesson5.Exercise5_19;

public class BooleanPrint {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int d=20;
        System.out.println(a==20);
        System.out.println(b==20);
        System.out.println((a>=10) && (b<40));
        System.out.println((d<=50) & (c<d));
        System.out.println((b<=a) || (c==d));
        System.out.println((c+d <b) | (30-b >= c));
    }
}

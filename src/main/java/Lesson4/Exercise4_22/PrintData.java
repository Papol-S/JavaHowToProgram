package Lesson4.Exercise4_22;

public class PrintData {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("N     10*N     100*N   1000*n");
        while (count <= 5){
            System.out.printf("%-6d%-9d%-8d%d\n",count,10*count,100*count,1000*count);
            count++;
        }
    }
}

package Lesson3.Exercise3_13;

public class InvoiceTest {
    public static void main(String[] args) {
        String partNumber = "test";
        String partDescribtion = "test2";
        int quantity = 10;
        double pricePerItem = 10;
        Invoice invoice1 = new Invoice(partNumber,partDescribtion,quantity,pricePerItem);
        System.out.printf("Amount of invoice1 is %.2f\n",invoice1.getInvoiceAmount());
        System.out.printf("Quantity is %d\n",invoice1.getQuantity());
        System.out.printf("Price per Item is %.2f\n",invoice1.getPricePerItem());
    }
}

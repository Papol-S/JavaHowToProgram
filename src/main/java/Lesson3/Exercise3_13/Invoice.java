package Lesson3.Exercise3_13;

public class Invoice {
    private String partNumber;
    private String partDescribtion;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescribtion, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescribtion = partDescribtion;
        if (quantity < 0)
            this.quantity = 0;
        else
            this.quantity = quantity;
        if (pricePerItem < 0)
            this.pricePerItem = 0;
        else
            this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescribtion() {
        return partDescribtion;
    }

    public void setPartDescribtion(String partDescribtion) {
        this.partDescribtion = partDescribtion;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount () {
        double amount = quantity*pricePerItem;
        return amount;
    }
}

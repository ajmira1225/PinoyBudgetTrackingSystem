// Transaction.java
import java.util.Date;

public class Transaction {
    private double amount;
    private String category;
    private Date date;

    // Constructor
    public Transaction(double amount, String category) {
        this.amount = amount;
        this.category = category;
        this.date = new Date(); // Current date
    }

    // Getter methods
    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public Date getDate() {
        return date;
    }
}

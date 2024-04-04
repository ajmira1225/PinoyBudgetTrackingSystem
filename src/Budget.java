// Budget.java
public class Budget {
    private double totalBudget;
    private double remainingBudget;

    // Constructor
    public Budget(double totalBudget) {
        this.totalBudget = totalBudget;
        this.remainingBudget = totalBudget;
    }

    // Getter methods
    public double getTotalBudget() {
        return totalBudget;
    }

    public double getRemainingBudget() {
        return remainingBudget;
    }

    // Method to update remaining budget
    public void updateRemainingBudget(double spentAmount) {
        remainingBudget -= spentAmount;
    }
}

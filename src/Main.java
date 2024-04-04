// Main.java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize budget
        System.out.print("Maglagay ng kabuuang badyet: ");
        double totalBudget = scanner.nextDouble();
        Budget budget = new Budget(totalBudget);

        // ArrayList to store transactions
        ArrayList<Transaction> transactions = new ArrayList<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Magdagdag ng Transaksyon");
            System.out.println("2. Tingnan ang Badyet");
            System.out.println("3. Tingnan ang mga Transaksyon");
            System.out.println("4. Exit");
            System.out.print("Pumili ng iyong pagpipilian: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Maglagay ng halaga ng transaksyon: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.println("Pili ka ng transaksyon:");
                    System.out.println("1. Pagkain");
                    System.out.println("2. Kuryente");
                    System.out.println("3. Tubig");
                    System.out.println("4. Transportasyon");
                    System.out.println("5. Edukasyon");
                    System.out.println("6. Bahay");
                    System.out.println("7. Pamasahe");
                    System.out.println("8. Libangan");
                    System.out.print("Pumili sa pagpipilian: ");
                    int categoryChoice = scanner.nextInt();
                    String category = getCategory(categoryChoice);
                    Transaction transaction = new Transaction(amount, category);
                    transactions.add(transaction);
                    budget.updateRemainingBudget(amount);
                    System.out.println("Matagumpay na idinagdag ang transaksyon!");
                    break;
                case 2:
                    System.out.println("Kabuuang badyet: " + budget.getTotalBudget());
                    System.out.println("Natitirang badyet: " + budget.getRemainingBudget());
                    break;
                case 3:
                    System.out.println("Mga Transaksyon:");
                    for (Transaction t : transactions) {
                        System.out.println("Halaga: " + t.getAmount() + ", Kategorya: " + t.getCategory() + ", Petsa: " + t.getDate());
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wala sa pagpipilian. Subukan uli.");
            }
        }

        scanner.close();
    }

    // Helper method to get category based on user choice
    public static String getCategory(int choice) {
        switch (choice) {
            case 1:
                return "Pagkain";
            case 2:
                return "Kuryente";
            case 3:
                return "Tubig";
            case 4:
                return "Transportasyon";
            case 5:
                return "Edukasyon";
            case 6:
                return "Bahay";
            case 7:
                return "Pamasahe";
            case 8:
                return "Libangan";
            default:
                return "Iba";
        }
    }
}

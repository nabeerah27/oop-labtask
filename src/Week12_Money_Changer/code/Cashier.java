package Week12_Money_Changer.code;

public class Cashier extends Person {

    private int bill;  // Price of the item
    private int totalChange;    // Total change to return

    // Pakistani currency denominations
    private int[] denominations = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};

    // Stock of notes/coins (parallel to denominations array)
    private int[] stock = {2, 3, 5, 10, 10, 10, 20, 20, 30, 100};
    // Example: 2 notes of 5000, 3 notes of 1000, etc.

    // Array to store counts of notes/coins
    private int[] returnAmount = new int[denominations.length];

    // Constructor
    public Cashier(String name) {
        super(name);
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public void showBill(String cashierName, String customerName) {
        System.out.println("\n========== 🧾 SHOP BILL ==========");
        System.out.printf("%-12s : %s\n", "Cashier", cashierName);
        System.out.printf("%-12s : %s\n", "Customer", customerName);
        System.out.printf("%-12s : Rs. %d\n", "Total Bill", bill);
        System.out.println("==================================\n");
    }

    // Make change considering stock availability, returns true if successful
    public boolean makeChange(int payment) {

        totalChange = payment - bill;
        System.out.println("Change to return Rs. " + totalChange);

        // temporary copy of stock to simulate transaction
        int[] tempStock = stock.clone();
        int remaining = totalChange;

        for(int i = 0; i < denominations.length; i++)
        {
            int needed = remaining / denominations[i];
            int canGive = Math.min(needed, stock[i]);
            returnAmount[i] = canGive;
            remaining -= canGive * denominations[i];
            tempStock[i] -= canGive;
        }

        if(remaining > 0)
        {
            System.out.println("Sorry! cannot return the full change. Payment rejected. ");
            return false; // cashier rejects the payment
        }
        else
        {
            // ✅ Only now update stock: add payment, deduct returned change
            addPaymentToStock(payment);
            stock = tempStock;
            return true;
        }
    }

    // Add customer's payment into stock (only if transaction is successful)
    public void addPaymentToStock(int payAmount) {
        int remaining = payAmount;
        for (int i = 0; i < denominations.length; i++)
        {
            int count = remaining / denominations[i];
            if (count > 0)
            {
                stock[i] += count;   // add these notes to cashier drawer
                remaining %= denominations[i];
            }
        }
    }

    // Return payment to customer if change cannot be given
    public void returnPayment(Customer customer, int amount) {
        customer.addBalance(amount); // give money back to customer's wallet
        System.out.println("💵 Cashier returned Rs. " + amount + " to " + customer.getName());
    }

    // Show cashier's current stock
    public void displayStock() {
        System.out.println("Cashier's Current Stock:");
        for (int i = 0; i < denominations.length; i++)
        {
            if (stock[i] > 0)
            {
                System.out.println(denominations[i] + " x " + stock[i]);
            }
        }
    }

    // ✅ toString() shows breakdown of the last transaction
    @Override
    public String toString() {
        if (totalChange == 0)
        {
            return "No change was needed.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Change breakdown:\n");
        for (int i = 0; i < denominations.length; i++)
        {
            if (returnAmount[i] > 0)
            {
                sb.append(denominations[i]).append(" x ").
                        append(returnAmount[i]).append("\n");
            }
        }
        return sb.toString();
    }

}


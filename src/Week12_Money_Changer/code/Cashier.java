package Week12_Money_Changer.code;

import java.util.LinkedHashMap;

public class Cashier extends Person {

    private int bill;  // Price of the item
    private int totalChange;    // Total change to return

    // Pakistani currency denominations
    private int[] denominations = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};

    // Stock of notes/coins (parallel to denominations array)
    private int[] stock = {2, 3, 5, 10, 10, 10, 20, 20, 30, 100};
    // Example: 2 notes of 5000, 3 notes of 1000, etc.

    // Constructor
    public Cashier(String name) {
        super(name);
    }

    public int getBill() {
        return bill;
    }

    // Setter for bill (set the total bill for the current customer)
    public void setBill(int bill) {
        this.bill = bill;
    }

    public int[] getDenominations() {
        return denominations;
    }

    // Print bill in a formatted way
    public void showBill(String cashierName, String customerName) {
        System.out.println("\n========== 🧾 SHOP BILL ==========");
        System.out.printf("%-12s : %s\n", "Cashier", cashierName);
        System.out.printf("%-12s : %s\n", "Customer", customerName);
        System.out.printf("%-12s : Rs. %d\n", "Total Bill", bill);
        System.out.println("==================================\n");
    }

    // Make change (USING ARRAY) considering stock availability, returns true if successful
    public int[] makeChangeArray(int payment) {

        totalChange = payment - bill;
        System.out.println("Change to return Rs. " + totalChange);

        // Start with a temporary stock that already includes the payment
        int[] tempStock = stock.clone();
        addPaymentToStock(tempStock, payment);

        // temporary copy of stock to simulate transaction
        int[] returnAmount = new int[denominations.length];
        int remaining = totalChange;

        for(int i = 0; i < denominations.length; i++)
        {
            int needed = remaining / denominations[i]; // note of this denomination needed
            int canGive = Math.min(needed, stock[i]); // check available stock
            returnAmount[i] = canGive;
            remaining -= canGive * denominations[i]; // reduce remaining change
            tempStock[i] -= canGive; // deduct from temporary stock
        }

        if(remaining > 0) // Cannot give exact change
        {
            System.out.println("Sorry! cannot return the full change. Payment rejected. ");
            return null; // cashier rejects the payment
        }
        else
        {
            // Update real stock
            stock = tempStock;
            return returnAmount;
        }
    }

    // Make change (USING HASHMAP) considering stock availability, returns true if successful
    public LinkedHashMap<Integer, Integer> makeChangeMap(int payment) {

        totalChange = payment - bill;
        System.out.println("Change to return Rs. " + totalChange);

        // Start with a temporary stock that already includes the payment
        int[] tempStock = stock.clone();
        addPaymentToStock(tempStock, payment);

        // Store denominations with count
        LinkedHashMap<Integer, Integer> changeMap = new LinkedHashMap<>();
        int remaining = totalChange;

        for (int i = 0; i < denominations.length; i++)
        {
            int needed = remaining / denominations[i];
            int canGive = Math.min(needed, stock[i]);
            if (canGive > 0)
            {
                changeMap.put(denominations[i], canGive);
            }
            remaining -= canGive * denominations[i];
            tempStock[i] -= canGive;
        }

        if (remaining > 0)
        {
            System.out.println("❌ Sorry! Cannot return full change. Payment rejected.");
            return null;
        }
        else
        {
            stock = tempStock; // update the real stock
            return changeMap;
        }
    }

    // Add customer's payment into temporary stock
    private void addPaymentToStock(int[] tempStock, int payment) {
        int remaining = payment;
        for (int i = 0; i < denominations.length; i++)
        {
            int count = remaining / denominations[i];
            if (count > 0)
            {
                tempStock[i] += count;   // add these notes to cashier drawer
                remaining %= denominations[i];
            }
        }
    }

    // Return full payment to customer if change cannot be given
    public void returnPayment(Customer customer, int amount) {
        customer.addBalance(amount); // give money back to customer's wallet
        System.out.println("💵 Cashier returned Rs. " + amount + " to " + customer.getName());
    }

    // Display cashier's current stock
    public void displayStock() {
        System.out.println("Cashier's Current Stock:");
        for (int i = 0; i < denominations.length; i++)
        {
            if (stock[i] > 0)
            {
                System.out.print(denominations[i] + "x" + stock[i] + " | ");
            }
        }
    }

}

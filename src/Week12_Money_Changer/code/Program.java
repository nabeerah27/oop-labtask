package Week12_Money_Changer.code;

import java.util.Scanner;

public class Program {

    public void run() {

        Scanner sc = new Scanner(System.in);

        // Input customer details
        System.out.print("Enter cashier's name: ");
        String cashierName = sc.nextLine();
        Cashier cashier = new Cashier(cashierName);

        System.out.print("Enter customer's name: ");
        String customerName = sc.nextLine();
        System.out.print("Enter " + customerName + "'s starting balance: ");
        int customerBalance = sc.nextInt();
        Customer customer = new Customer(customerName, customerBalance);

        System.out.println("\n🛒 Welcome to the Shop!");

        // Cashier makes a bill
        System.out.print("Enter total bill amount: ");
        int bill = sc.nextInt();
        cashier.setBill(bill);

        // Cashier shows bill
        cashier.showBill(cashierName, customerName);

        // Customer decides how much to pay
        System.out.print("Enter how much the customer pays: ");
        int payment = sc.nextInt();

        // Customer attempts payment
        boolean success = customer.payBill(cashier, payment);
        System.out.println();

        // Cashier handles change if needed
        if (success)
        {
            if (payment > bill)
            {
                boolean changeGiven = cashier.makeChange(payment);
                if (!changeGiven)
                {
                    System.out.println("❌ Transaction failed: Cashier cannot give change.");
                    cashier.returnPayment(customer, payment); // cashier gives money back to the customer
                }
                else
                {
                    System.out.println("✅ Transaction successful!");
                    System.out.println(cashier); // shows breakdown of change
                    cashier.displayStock();
                }
            }
            else // Exact payment, no change
            {
                System.out.println("✅ Transaction successful! (No change needed)");
                cashier.addPaymentToStock(payment);
                cashier.displayStock();
            }
        }
        else
        {
            System.out.println("❌ Transaction failed. Please try again.");
        }

        // Final state of customer’s wallet
        System.out.println("-----------------------------------");
        System.out.println(customer);

        sc.close();


    }
}

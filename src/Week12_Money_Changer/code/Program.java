package Week12_Money_Changer.code;

import java.util.Scanner;

public class Program {

    public void run() {

        Scanner sc = new Scanner(System.in);

        // Create cashier and customer
        Cashier cashier = new Cashier("Ahmed");
        Customer customer = new Customer("Ali", 10000); // customer has Rs. 10,000

        System.out.println("🛒 Welcome to the Shop!");
        System.out.println("Cashier: " + cashier.getName());
        System.out.println("Customer: " + customer.getName() + " having money Rs. " + customer.getBalance());
        System.out.println("-----------------------------------");

        // Cashier makes a bill
        System.out.print("Enter total bill amount: ");
        int bill = sc.nextInt();
        cashier.setBill(bill);

        // Cashier shows bill
        cashier.showBill();

        // Customer decides how much to pay
        System.out.print("Enter how much the customer pays: ");
        int payment = sc.nextInt();

        // Customer attempts payment
        boolean success = customer.payBill(cashier, payment);

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
                }
            }
            else
            {
                System.out.println("✅ Transaction successful! (No change needed)");
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

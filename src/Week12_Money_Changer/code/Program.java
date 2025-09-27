package Week12_Money_Changer.code;

import java.util.HashMap;
import java.util.Scanner;

public class Program {

    public void run() {

        Scanner sc = new Scanner(System.in);

        // Input customer details
        System.out.print("\nEnter cashier's name: ");
        String cashierName = sc.nextLine();
        Cashier cashier = new Cashier(cashierName);
        cashier.displayStock();

        // Input customer details
        System.out.print("\nEnter customer's name: ");
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

        if(success)
        {
            if(payment == cashier.getBill())
            {
                System.out.println("\n" + customerName + "'s current balance: " + customer.getBalance());
                cashier.displayStock();
                return;
            }
            else
            {
                // Choose change method
                System.out.println("""
                \nChoose change method:\s
                1. Array version\s
                2. HashMap version\s
                Enter you choice:""");

                int choice = sc.nextInt();

                // ARRAY VERSION
                if(choice == 1)
                {
                    int[] returnedArray = cashier.makeChangeArray(payment);
                    if(returnedArray != null)
                    {
                        System.out.println("Change returned as: ");
                        int[] denoms = cashier.getDenominations();

                        for (int i = 0; i < denoms.length; i++)
                        {
                            if(returnedArray[i] > 0)
                            {
                                System.out.println(denoms[i] + " x " + returnedArray[i]);
                            }
                        }
                    }
                    else
                    {
                        cashier.returnPayment(customer, payment);
                    }
                }
                // HASHMAP VERSION
                else if(choice == 2)
                {
                    HashMap<Integer, Integer> returnedMap = cashier.makeChangeMap(payment);
                    if(returnedMap != null)
                    {
                        System.out.println("Change returned as: ");
                        for(HashMap.Entry<Integer, Integer> entry : returnedMap.entrySet())
                        {
                            System.out.println(entry.getKey() + " x " + entry.getValue());
                        }
                    }
                    else
                    {
                        cashier.returnPayment(customer, payment);
                    }
                }
            }
        }
        else
        {
            System.out.println("Transaction failed! Money not deducted. ");
        }

        System.out.println("\n" + customerName + "'s current balance: " + customer.getBalance());
        cashier.displayStock();

    }
}

package Week12_Money_Changer.code;

import java.util.HashMap;
import java.util.Scanner;

public class Program {

    public void run() {

        Scanner sc = new Scanner(System.in);

        // Input customer details
        System.out.print("\nEnter uncle's name: ");
        String uncleName = sc.nextLine();
        Cashier uncle = new Cashier(uncleName);
        uncle.displayStock();

        // Input customer details
        System.out.print("\n\nEnter khareedar's name: ");
        String khareedarNaam = sc.nextLine();
        System.out.print("Enter " + khareedarNaam + "'s starting balance: ");
        int khareedarPaisay = sc.nextInt();
        Customer aunty = new Customer(khareedarNaam, khareedarPaisay);

        System.out.println("\n🛒 Welcome to the Shop!");

        // Cashier makes a bill
        System.out.print("Enter total bill amount: ");
        int bill = sc.nextInt();
        uncle.setBill(bill);

        // Cashier shows bill
        uncle.showBill(uncleName, khareedarNaam);

        // Customer decides how much to pay
        System.out.print("Enter how much " + khareedarNaam + " pays: ");
        int payment = sc.nextInt();

        // Customer attempts payment
        boolean success = aunty.payBill(uncle, payment);

        if(success)
        {
            if(payment == uncle.getBill())
            {
                System.out.println("\n" + khareedarNaam + "'s current balance: " + aunty.getBalance());
                uncle.displayStock();
                return;
            }
            else
            {
                // Choose change method
                System.out.print("""
                \nChoose change method:\s
                1. Array version\s
                2. HashMap version\s
                Enter you choice: \s""");

                int choice = sc.nextInt();

                // ARRAY VERSION
                if(choice == 1)
                {
                    int[] khullayPaisay = uncle.makeChangeArray(payment);
                    if(khullayPaisay != null)
                    {
                        System.out.println("\nChange returned as: ");
                        int[] denoms = uncle.getDenominations();

                        for (int i = 0; i < denoms.length; i++)
                        {
                            if(khullayPaisay[i] > 0)
                            {
                                System.out.println(denoms[i] + " x " + khullayPaisay[i]);
                            }
                        }
                    }
                    else
                    {
                        uncle.returnPayment(aunty, payment);
                    }
                }
                // HASHMAP VERSION
                else if(choice == 2)
                {
                    HashMap<Integer, Integer> returnedMap = uncle.makeChangeMap(payment);
                    if(returnedMap != null)
                    {
                        System.out.println("\nChange returned as: ");
                        for(HashMap.Entry<Integer, Integer> entry : returnedMap.entrySet())
                        {
                            System.out.println(entry.getKey() + " x " + entry.getValue());
                        }
                    }
                    else
                    {
                        uncle.returnPayment(aunty, payment);
                    }
                }
            }
        }
        else
        {
            System.out.println("Transaction failed! Money not deducted. ");
        }

        System.out.println("\n" + khareedarNaam + "'s current balance: " + aunty.getBalance());
        uncle.displayStock();
        System.out.println();

    }
}

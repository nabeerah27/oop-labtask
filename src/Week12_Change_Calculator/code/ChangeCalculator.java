package Week12_Change_Calculator.code;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ChangeCalculator {

    private Scanner sc = new Scanner(System.in);
    private int chargedAmount;  // Price of the item
    private int givenAmount;    // Money given by the costumer
    private int totalChange;    // Total change to return

    // Pakistani currency denominations
    private int[] noteDenominations = {5000, 1000, 500, 100, 50, 20, 10};
    private int[] coinDenominations = {5, 2, 1};

    // Arrays to store counts of notes/coins
    private int[] noteCount = new int[noteDenominations.length];
    private int[] coinCount = new int[coinDenominations.length];

    // Take input from the user
    public void takeInput() {
        System.out.print("Enter charged amount: ");
        chargedAmount = sc.nextInt();
        System.out.print("Enter given amount: ");
        givenAmount = sc.nextInt();
    }

    // Process payment and calculate change breakdown
    public void processPayment() {
        totalChange = givenAmount - chargedAmount;

        if (totalChange < 0)
        {
            System.out.println("Customer has given less money than charged amount. ");
            return;
        }
        else if (totalChange == 0)
        {
            System.out.println("Customer has given exactly the same amount. No change needed. ");
            return;
        }
        else
        {
            System.out.println("Customer has given more amount. Return the change. ");
            calculateNotes();
            calculateCoins();
        }
    }

    // Method to calculate notes
    private void calculateNotes() {
        int remainingChange = totalChange;

        for (int i = 0; i < noteDenominations.length; i++)
        {
            noteCount[i] = remainingChange / noteDenominations[i];
            remainingChange %= noteDenominations[i];
        }
        totalChange = remainingChange; // update remaining change for coins
    }

    // Method to calculate coins
    private void calculateCoins() {
        int remainingChange = totalChange;

        for (int i = 0; i < coinDenominations.length; i++)
        {
            coinCount[i] = remainingChange / coinDenominations[i];
            remainingChange %= coinDenominations[i];
        }
        totalChange = remainingChange; // should become 0 at the end
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Notes section
        if (hasAny(noteCount))
        {
            sb.append("\nNotes:\n");
            for (int i = 0; i < noteDenominations.length; i++)
            {
                if (noteCount[i] > 0)
                {
                    sb.append(noteCount[i]).append(" x ").
                            append(noteDenominations[i]).append("\n");
                }
            }
        }

        // Coins section
        if (hasAny(coinCount))
        {
            sb.append("Coins:\n");
            for (int i = 0; i < coinDenominations.length; i++)
            {
                if (coinCount[i] > 0)
                {
                    sb.append(coinCount[i]).append(" x ").
                            append(coinDenominations[i]).append("\n");
                }
            }
        }

        return sb.toString();
    }

    // Helper method to check if any count is greater than zero
    private boolean hasAny(int[] arr)
    {
        for (int val : arr)
        {
            if (val > 0)
                return true;
        }
        return false;
    }

}


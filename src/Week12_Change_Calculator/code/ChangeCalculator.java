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

    // Stores the breakdown of change
    private Map<Integer, Integer> changeBreakdown = new LinkedHashMap<>();

    // Take input from the user
    public void takeInput() {
        System.out.print("Enter charged amount: ");
        chargedAmount = sc.nextInt();
        System.out.print("Enter given amount: ");
        givenAmount = sc.nextInt();
    }

    // Validates payment and calculate change
    public boolean validatePayment() {
        totalChange = givenAmount - chargedAmount;

        if (totalChange < 0)
        {
            System.out.println("Customer has given less money than charged amount. ");
            return false;
        }
        else if (totalChange == 0)
        {
            System.out.println("Customer has given exactly the same amount. No change needed. ");
            return false;
        }
        else
        {
            System.out.println("Customer has given more amount. Return the change. ");
            return true;
        }
    }

    // Computes how to return the change using minimum number of notes OR coins
    public void calculateChangeBreakdown() {

        // Clear any previous results before recalculating
        changeBreakdown.clear();

        // First distribute notes (higher denomination)
        for (int note : noteDenominations)
        {
            // Check how many times this note can fit into remaining change
            int count = totalChange / note;
            if (count > 0)
            {
                // Store note and its count in the map
                changeBreakdown.put(note, count);
                totalChange -= count * note; // reduce the change by value of notes
            }
        }

        // Then distribute coins (lower denomination)
        for (int coin : coinDenominations)
        {
            int count = totalChange / coin;
            if (count > 0)
            {
                changeBreakdown.put(coin, count);
                totalChange -= count * coin;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // ---------- NOTES SECTION ----------
        // Check if there are any notes in the change
        boolean hasNotes = false;
        for (int note : noteDenominations)
        {
            if (changeBreakdown.containsKey(note)) // if this note denomination exists in the map
            {
                hasNotes = true;
                break;
            }
        }

        // If notes exist, print the "Notes:" heading and list each note with its count
        if (hasNotes)
        {
            sb.append("Notes:\n");
            for (int note : noteDenominations)
            {
                if (changeBreakdown.containsKey(note))
                {
                    sb.append(changeBreakdown.get(note)) // number of notes
                            .append(" x ")
                            .append(note) // denomination value
                            .append("\n");
                }
            }
        }

        // ---------- COINS SECTION ----------
        // Check if there are any coins in the change
        boolean hasCoins = false;
        for (int coin : coinDenominations)
        {
            if (changeBreakdown.containsKey(coin)) // if this coin denomination exists in the map
            {
                hasCoins = true;
                break;
            }
        }

        // If coins exist, print the "Coins:" heading and list each coin with its count
        if (hasCoins)
        {
            sb.append("Coins:\n");
            for (int coin : coinDenominations)
            {
                if (changeBreakdown.containsKey(coin))
                {
                    sb.append(changeBreakdown.get(coin)) // number of coins
                            .append(" x ")
                            .append(coin) // denomination value
                            .append("\n");
                }
            }
        }

        // Return the final structured output
        return sb.toString();

    }
}


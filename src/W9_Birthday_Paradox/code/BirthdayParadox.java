package W9_Birthday_Paradox.code;

import java.util.HashSet;
import java.util.Random;

public class BirthdayParadox {

    private Random random;      // Random number generator for birthdays

    // Constructor initializes the Random object
    public BirthdayParadox() {
        this.random = new Random();
    }

    // Check if a group of 'numPeople' has duplicate birthdays
    private boolean hasDuplicate(int numPeople) {
        HashSet<Integer> birthdays = new HashSet<>(); // Store unique birthdays

        for (int i = 0; i < numPeople; i++)
        {
            int birthday = random.nextInt(365) + 1; // Generate a random birthday (1-365)
            if (birthdays.contains(birthday))
            {
                return true;    // Duplicate found
            }
            birthdays.add(birthday);    // Add birthday to the set
        }
        return false;   // No duplicate found in this group
    }

    // Run multiple trials and calculate probability
    public int runSimulation(int numPeople, int trials) {

        int duplicateCount = 0;     // Count how many trials had duplicates

        for (int i = 0; i < trials; i++)
        {
            if (hasDuplicate(numPeople))
            {
                duplicateCount ++;      // Increment if duplicate found
            }
        }
        return duplicateCount;
    }

}
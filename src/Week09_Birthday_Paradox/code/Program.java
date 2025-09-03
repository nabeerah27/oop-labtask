package Week09_Birthday_Paradox.code;

public class Program {

    public void run() {

        int numPeople = Utils.inputNumPeoples();
        int trials = Utils.inputTrials();

        BirthdayParadox birthdayParadox = new BirthdayParadox();
        int duplicateCount = birthdayParadox.runSimulation(numPeople, trials);

        double probability = (double) duplicateCount / trials;
        System.out.println("\nEstimated probability with " + numPeople + " people: " + probability);
        System.out.println("Duplicate counts " + duplicateCount + " out of " + trials + " trials\n");

        Utils.printRow("Number of People", "Probability", "Duplicate Counts");
        System.out.println("-------------------------------------------------------");

        // Test group sizes from 5 to 100 in steps of 5
        for (int i = numPeople; i <= trials; i += 5)
        {
             duplicateCount = birthdayParadox.runSimulation(i, trials);
             probability = (double) duplicateCount / trials;

             Utils.printRow(String.valueOf(i),
                     String.format("%.3f", probability), String.valueOf(duplicateCount));
        }

    }
}

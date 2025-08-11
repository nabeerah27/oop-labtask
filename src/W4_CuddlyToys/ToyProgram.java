package W4_CuddlyToys;

public class ToyProgram {

    public void run() {

        System.out.println("****** Same Reference and Object type ******");

        CuddlyToy toy1 = new CuddlyToy("Medium");
        System.out.println(toy1);

        System.out.println("--------------------------------------");

        TeddyBear teddy = new TeddyBear("Large", "Brown");
        System.out.println(teddy);

        System.out.println("--------------------------------------");

        BunnyRabbit bunny = new BunnyRabbit("Small", "Black");
        System.out.println(bunny);

        System.out.println("--------------------------------------");

        Gardener gardener = new Gardener("Medium");
        System.out.println(gardener);

        System.out.println("--------------------------------------");

        EngineDriver driver = new EngineDriver("Large");
        System.out.println(driver);

        System.out.println("--------------------------------------");

        Clown clown = new Clown("Medium");
        System.out.println(clown);

        System.out.println("--------------------------------------");

        BankManager manager = new BankManager("Small");
        System.out.println(manager);

        System.out.println("--------------------------------------");

        System.out.println("Reference type ➡ Parent / Grandparent,   \n" +
                "\t Object type ➡ Child/Parent\n");

        CuddlyToy bhalo = new TeddyBear("Small", "Brown");
        System.out.println(bhalo);

        System.out.println("--------------------------------------");

        CuddlyToy bankManager = new BankManager("Medium");
        System.out.println(bankManager);

        System.out.println("--------------------------------------");

        TeddyBear mali = new Gardener("Large");
        System.out.println(mali);

        System.out.println("--------------------------------------");

        BunnyRabbit joker = new Clown("Medium");
        System.out.println(joker);


    }
}

package Week04_CuddlyToys.code;

public class ToyProgram {

    public void run() {

        System.out.println("--- Creating Toys ---");
        System.out.println("Reference Type : GRAND PARENT, Object Type : CHILD");
        System.out.println();

        // 1. Upcasting: Reference type is CuddlyToy, object type is specific subclass

        CuddlyToy teddy1 = new EngineDriver("Medium");
        System.out.println(teddy1);
        teddy1.makeNoise();
        System.out.println();

        CuddlyToy teddy2 = new Gardener("Large");
        System.out.println(teddy2);
        teddy2.makeNoise();
        System.out.println();

        CuddlyToy bunny1 = new Clown("Small");
        System.out.println(bunny1);
        bunny1.makeNoise();
        System.out.println();

        CuddlyToy bunny2 = new BankManager("Large");
        System.out.println(bunny2);
        bunny2.makeNoise();

        System.out.println("** Grandparent methods can accessible easily! ");
        System.out.println("Size of bunny2: " + bunny2.getSize()); // Works

        // ❌ Won't compile! Why? Reference type is CuddlyToy
        // System.out.println(bunny2.getColor());
        // System.out.println(bunny2.getJob());

        System.out.println("\n--- Downcasting ---");

        System.out.println("We have a CuddlyToy reference, but the actual object is Bank Manager.");
        System.out.println("To access Gardener-specific methods, we need to downcast.");
        System.out.println();

        System.out.println("** bunny2 is down casted to Bank Manager ");
        if (bunny2 instanceof BankManager)
        {
            BankManager manager = (BankManager) bunny2;
            System.out.println("Downcast successful! ");
            System.out.println("Color: " + manager.getColor());
            System.out.println("Job: " + manager.getJob());
        }
        else
        {
            System.out.println("Abort mission! 🚫 Wrong type detected!");
        }

        System.out.println("** bunny1 is down casted to Gardener ");
        if(bunny1 instanceof Gardener)
        {
            Gardener gardener = (Gardener) bunny1;
            System.out.println("Downcast successful! ");
            System.out.println("Color: " + gardener.getColor());
            System.out.println("Job: " + gardener.getJob());
        }
        else
        {
            System.out.println("Abort mission! 🚫 Wrong type detected!");
        }

    }
}

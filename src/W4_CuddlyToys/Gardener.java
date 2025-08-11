package W4_CuddlyToys;

// Gardener class is a derived (child) class of TeddyBear
public class Gardener extends TeddyBear {

    private String job;

    // Constructor - calls the TeddyBear constructor
    // Sets a fixed color (Red) and action (Water plants)

    public Gardener(String size) {
        super(size, "Red");
        this.job = "Water plants";
    }

    // Overriding the getRole() method to specify this teddy bear's role
    public String getJob() {
        return job;
    }

    public void describe() {
        System.out.println("I am a Teddy Gardener 👨‍🌾");
        super.describe();
        System.out.println("My job is to " + job + "🌱");
    }

    // Overriding toString() to include role and parent class details
    @Override
    public String toString() {
        return "👨‍🌾 Gardener [Size = " + getSize() + ", Color = " + getColor() + ", Job = " + job + "]";
    }


}

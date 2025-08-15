package W4_CuddlyToys.code;

// EngineDriver class is a derived (child) class of TeddyBear
public class EngineDriver extends TeddyBear {

    private String job;

    // Constructor - calls the TeddyBear constructor
    // Sets a fixed color (Blue) and action (Drive engines)

    public EngineDriver(String size) {
        super(size, "Blue");
        this.job = "Drive engines";
    }

    // Overriding the getRole() method to specify this teddy bear's role
    public String getJob() {
        return job;
    }

    // Overriding toString() to include role and parent class details
    @Override
    public String toString() {
        return "👨‍✈️ Engine driver [Size = " + getSize() + ", Color = " + getColor() + ", Job = " + job + "]";
    }

}

package W4_CuddlyToys.code;

// BankManager class is a derived class (child) of BunnyRabbits
public class BankManager extends BunnyRabbit {

    private String job;

    // Constructor - calls the parent (BunnyRabbits) constructor
    // Sets a fixed color (White) and action (Manage accounts)

    public BankManager(String size) {
        super(size, "White");
        this.job = "Manage accounts";
    }

    // Overriding the getRole method to specify this bunny's role
    public String getJob() {
        return job;
    }

    // Overriding toString() to include role and parent class details
    @Override
    public String toString() {
        return "🏦 Bank manager [Size = " + getSize() + ", Color = " + getColor() + ", Job = " + job + "]";
    }

}

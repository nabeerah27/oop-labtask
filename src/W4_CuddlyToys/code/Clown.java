package W4_CuddlyToys.code;

// Clown class is a derived (child) class of BunnyRabbits
public class Clown extends BunnyRabbit {

    private String job;

    // Constructor - calls the BunnyRabbits constructor
    // Sets a fixed color (Black) and action (Entertain people)

    public Clown(String size) {
        super(size, "Black");
        this.job = "Entertain people";
    }

    // Overriding the getRole() method to specify this bunny's role
    public String getJob() {
        return job;
    }

    // Overriding toString() to include role and parent class details
    @Override
    public String toString() {
        return "🤡 Clown [Size = " + getSize() + ", Color = " + getColor() + ", Job = " + job + "]";
    }

}

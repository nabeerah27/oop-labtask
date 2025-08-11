package W4_CuddlyToys;

// TeddyBear is an intermediate class (Parent class) that extends the base class CuddlyToy
public class TeddyBear extends CuddlyToy {

    private String color;

    // Constructor - calls the base class (CuddlyToy) constructor
    // Sets size, color, and job (task/role) for the teddy bear

    public TeddyBear(String size, String color) {
        super(size);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // A specific behavior for teddy bears - making noise
    public void makeNoise() {
        System.out.println("Teddy says: GROWL! ");
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("My color is " + color);
    }

    // Overriding toString() to include the toy type and base class details
    @Override
    public String toString() {
        return "🧸 Teddy Bear [Size = " + getSize() + ", Color = " + color + "]";
    }


}

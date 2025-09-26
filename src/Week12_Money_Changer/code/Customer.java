package Week12_Money_Changer.code;

public class Customer extends Person {

    private int balance; // Money the customer has

    // Constructor
    public Customer(String name, int balance) {
        super(name);
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public boolean payBill(Cashier cashier, int payment) {
        int bill = cashier.getBill();

        if(payment > balance)
        {
            System.out.println("You don't have enough money to pay the bill. You only have Rs. " + balance);
            return false;
        }
        if(payment < bill)
        {
            System.out.println("Insufficient payment. Please pay at least Rs. " + bill);
            return false;
        }
        else if(payment == bill)
        {
            System.out.println("Exact payment received. No change required. ");
            balance -= bill; // deduct money of the bill from the customer's wallet
            return true;
        }
        else
        {
            System.out.println("Payment received Rs. " + payment + ". Return the change. ");
            balance -= cashier.getBill(); // deduct the bill amount
            return true;
        }
    }

    public void addBalance(int amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Customer: " + getName() + ", Balance left: Rs. " + balance;
    }

}

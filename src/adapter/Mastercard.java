package adapter;

/**
 * Created by User on 18/11/2015.
 */
public class Mastercard implements IPay{

    private double balance = 0f;

    public Mastercard(double balance) {
        this.balance = balance;
    }

    public void makePayment(double amount){
        if(balance < 0) {
            System.out.println("Sorry now funds");
        }
        else{
            balance -= amount;
            System.out.println("Making payment of " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

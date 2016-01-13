package adapter;

/**
 * Created by User on 18/11/2015.
 */
public class Visa {
    private double balance = 0;

    public Visa(double balance) {
        this.balance = balance;
    }


    public void pay(double amount){
        if(balance < 0 + amount) {
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

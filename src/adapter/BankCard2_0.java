package adapter;

/**
 * Created by User on 18/11/2015.
 */
public class BankCard2_0{
    private double balance = 0;

    public BankCard2_0(double balance) {
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

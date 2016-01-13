package adapter;

/**
 * Created by User on 18/11/2015.
 */
public class BankCard implements IPay{

    private double balance = 0;

    public BankCard(double balance) {
        this.balance = balance;
    }

    //old way of paying using the makePayment method. Bank have now changed to purchaseGoods() method
    //Option one -calls to makePayment will have to change/udpate tests or  option two - create an adapter
    public void makePayment(double amount){
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

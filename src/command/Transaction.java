package command;

public class Transaction {

    private double balance = 100f;

    public void withdraw(double amount){
        System.out.println("Current Balance:" + balance);
        if(balance < 0f) {
            System.out.println("Sorry now funds.\nBalance: " + balance);
        }
        else{
            balance -= amount;
            System.out.println("Withdrawing:" + amount + "\nNew Balance:" + balance + "\n");
        }
    }

    public void lodge(double amount){
        System.out.println("Current Balance:" + balance);
        balance += amount;
        System.out.println("Lodging:"  + amount + "\nNew Balance:" + balance + "\n");
    }

}

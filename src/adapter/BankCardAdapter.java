package adapter;

/**
 * Created by User on 18/11/2015.
 */
public class BankCardAdapter implements IPay{

    private Visa visa;

    public BankCardAdapter(Visa visa) {
        this.visa = visa;
    }

    @Override
    public void makePayment(double payment) {
        visa.pay(payment);
    }
}

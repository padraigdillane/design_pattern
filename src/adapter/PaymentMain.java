package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 18/11/2015.
 */
public class PaymentMain {

    public static void main(String[] args) {

        Mastercard mastercard = new Mastercard(100f);
        Visa visacard = new Visa(100f);

        List<IPay> pendingTransactions = new ArrayList<IPay>();

        pendingTransactions.add(mastercard);
        pendingTransactions.add(new BankCardAdapter(visacard));

        for (IPay ip : pendingTransactions) {
            ip.makePayment(25f);
        }

        System.out.println(mastercard.getBalance());
        System.out.println(visacard.getBalance());
    }
}


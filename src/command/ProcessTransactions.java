package command;

import java.util.List;

public class ProcessTransactions {

    private List<UserTransaction> transactionList;

    public ProcessTransactions(List<UserTransaction> transactionList) {
        this.transactionList = transactionList;
    }

    public void queueTransactions(UserTransaction userChoice){
        transactionList.add(userChoice);
    }

    public void processTransactions(){
        for (UserTransaction transaction : transactionList) {
            transaction.execute();
        }
    }
}

package command;

import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {

        Transaction transaction = new Transaction();

        LodgeCommand lodgeCommand = new LodgeCommand(transaction);
        WithdrawCommand withdrawCommand = new WithdrawCommand(transaction);

        ProcessTransactions processTransactions = new ProcessTransactions(new ArrayList<>());

        processTransactions.queueTransactions(lodgeCommand);
        processTransactions.queueTransactions(withdrawCommand);
        processTransactions.queueTransactions(lodgeCommand);

        processTransactions.processTransactions();
    }
}

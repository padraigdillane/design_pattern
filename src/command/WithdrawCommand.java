package command;

public class WithdrawCommand implements UserTransaction {

    private Transaction transaction;

    public WithdrawCommand(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void execute() {
        transaction.withdraw(90f);
    }
}
package command;

public class LodgeCommand implements UserTransaction {

    private Transaction transaction;

    public LodgeCommand(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void execute() {
        transaction.lodge(100f);
    }
}

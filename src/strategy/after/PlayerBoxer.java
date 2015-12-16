package strategy.after;

public class PlayerBoxer implements IBoxer{
    int playerHealth;

    public PlayerBoxer(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public PlayerBoxer() {
    }

    @Override
    public void decreasePlayerHealth(int amount) {
        playerHealth -= amount;
    }

    @Override
    public int getHealth() {
        return playerHealth;
    }


    @Override
    public void attacking() {
        System.out.println("Attacking");
    }

    @Override
    public void jab() {
        System.out.println("jab");
    }

    @Override
    public void hook() {
        System.out.println("Hook");
    }

    @Override
    public void uppercut() {
        System.out.println("Uppercut");
    }

    @Override
    public void survive() {
        System.out.println("Surviving");
    }

    @Override
    public void block() {
        System.out.println("Block");
    }

    @Override
    public void knockedOut() {
        System.out.println("KO'd");
    }

    @Override
    public void clinch() {
        System.out.println("Clinch");
    }

    @Override
    public void cautious() {
        System.out.println("Being Cautious");
    }
}

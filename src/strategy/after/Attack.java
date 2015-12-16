package strategy.after;


public class Attack implements IBoxerStrategy {
    @Override
    public void move(int health) {
        System.out.println("Attack attack, your health is only at " + health);
    }
}

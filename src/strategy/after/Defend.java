package strategy.after;

public class Defend implements IBoxerStrategy {
    @Override
    public void move(int health) {
        System.out.println("Defend yourself, your health is at " + health);
    }
}

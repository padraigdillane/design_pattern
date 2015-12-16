package strategy.after;

public class Cautious implements IBoxerStrategy {
    @Override
    public void move(int health) {
        System.out.println("Take it easy your health is at " + health);
    }
}

package strategy.after;

public class Cautious implements IBoxerStrategy {


    @Override
    public void cornerManShout(int playerHealth) {
        System.out.println("Player Health:"+playerHealth + " Corner man advice: Hands up - jab, jab");
    }

}

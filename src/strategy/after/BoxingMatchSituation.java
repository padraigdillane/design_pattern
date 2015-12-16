package strategy.after;

public class BoxingMatchSituation{
    private IBoxerStrategy iBoxerStrategy;

    public BoxingMatchSituation(IBoxerStrategy iBoxerStrategy) {
        this.iBoxerStrategy = iBoxerStrategy;
    }

    public void adjustBoxerMovement(int health){
        this.iBoxerStrategy.move(health);
    }
}

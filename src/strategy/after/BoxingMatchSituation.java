package strategy.after;

import factory.IBoxer;
import state.PlayerBoxerState;

public class BoxingMatchSituation{

    private IBoxerStrategy iBoxerStrategy;
    private PlayerBoxerState playerBoxerState;
    private IBoxer iBoxer;

    public BoxingMatchSituation(IBoxer boxer, IBoxerStrategy iBoxerStrategy) {
        this.iBoxerStrategy = iBoxerStrategy;
        this.iBoxer = boxer;
    }

    public void adjustCornerManAdvice(int health){
        this.iBoxerStrategy.cornerManShout(health);
    }

    public void setPlayerBoxerState(PlayerBoxerState playerBoxerState) {
        this.playerBoxerState = playerBoxerState;
    }

    public void getBoxerAction(){
        playerBoxerState.action(iBoxer);
    }
}

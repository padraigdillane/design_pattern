package strategy.after;

import factory.*;
import factory.IBoxer;
import state.PlayerBoxerState;

public class BoxingMatchSituation{

    private IBoxerStrategy iBoxerStrategy;
    private PlayerBoxerState playerBoxerState;
    private PlayerBoxer playerBoxer = new PlayerBoxer();

    private IBoxer bb;
    LightweightBoxer b = new LightweightBoxer();

    public BoxingMatchSituation(IBoxerStrategy iBoxerStrategy, IBoxer bb) {
        this.iBoxerStrategy = iBoxerStrategy;
        this.bb = bb;
    }

    public void adjustCornerManAdvice(int health){
        this.iBoxerStrategy.cornerManShout(health);
    }

    public void setPlayerBoxerState(PlayerBoxerState playerBoxerState) {
        this.playerBoxerState = playerBoxerState;
    }

    public void getBoxerAction(){
        playerBoxerState.action(bb);
    }
}

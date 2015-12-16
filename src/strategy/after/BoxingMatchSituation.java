package strategy.after;

import state.PlayerBoxerState;

public class BoxingMatchSituation{
    
    private IBoxerStrategy iBoxerStrategy;
    private PlayerBoxerState playerBoxerState;
    private PlayerBoxer playerBoxer = new PlayerBoxer();

    public BoxingMatchSituation(IBoxerStrategy iBoxerStrategy) {
        this.iBoxerStrategy = iBoxerStrategy;
    }

    public void adjustCornerManAdvice(int health){
        this.iBoxerStrategy.cornerManShout(health);
    }

    public void setPlayerBoxerState(PlayerBoxerState playerBoxerState) {
        this.playerBoxerState = playerBoxerState;
    }

    public void getBoxerAction(){
        playerBoxerState.action(playerBoxer);
    }
}

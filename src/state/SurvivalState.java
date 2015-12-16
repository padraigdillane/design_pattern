package state;

import strategy.after.PlayerBoxer;

public class SurvivalState implements PlayerBoxerState {
    @Override
    public void action(PlayerBoxer playerBoxer) {
        playerBoxer.survive();
        playerBoxer.block();
        playerBoxer.clinch();
    }
}

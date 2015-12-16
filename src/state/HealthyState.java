package state;

import strategy.after.PlayerBoxer;

public class HealthyState implements PlayerBoxerState {
    @Override
    public void action(PlayerBoxer playerBoxer) {
        playerBoxer.attacking();
        playerBoxer.jab();
        playerBoxer.hook();
        playerBoxer.uppercut();
    }
}

package state;

import strategy.after.PlayerBoxer;

public class KnockedOutState implements PlayerBoxerState {

    @Override
    public void action(PlayerBoxer playerBoxer) {
        playerBoxer.knockedOut();
    }
}

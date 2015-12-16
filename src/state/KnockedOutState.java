package state;

import strategy.after.PlayerBoxer;

public class KnockedOutState implements PlayerBoxerState {

    PlayerBoxer playerBoxer;

    @Override
    public void action(PlayerBoxer playerBoxer) {
        playerBoxer.knockedOut();
    }
}

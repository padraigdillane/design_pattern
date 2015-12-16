package state;

import strategy.after.PlayerBoxer;

public class CautiousState implements PlayerBoxerState{
    @Override
    public void action(PlayerBoxer playerBoxer) {
        playerBoxer.cautious();
        playerBoxer.block();
        playerBoxer.jab();
        playerBoxer.jab();
        playerBoxer.block();
    }
}

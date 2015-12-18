package state;

import factory.IBoxer;

public class KnockedOutState implements PlayerBoxerState {

    @Override
    public void action(IBoxer boxer) {
        boxer.knockedOut();
    }
}

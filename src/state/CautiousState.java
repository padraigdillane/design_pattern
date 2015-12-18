package state;

import factory.IBoxer;

public class CautiousState implements PlayerBoxerState{

    @Override
    public void action(IBoxer boxer) {
        boxer.cautious();
        boxer.block();
        boxer.jab();
        boxer.jab();
        boxer.block();
    }
}

package state;

import factory.IBoxer;

public class HealthyState implements PlayerBoxerState {
    @Override
    public void action(IBoxer boxer) {
        boxer.attacking();
        boxer.jab();
        boxer.hook();
        boxer.uppercut();
    }
}

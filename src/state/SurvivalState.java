package state;

import factory.IBoxer;
import strategy.after.PlayerBoxer;

public class SurvivalState implements PlayerBoxerState {
    @Override
    public void action(IBoxer boxer) {
        boxer.survive();
        boxer.block();
        boxer.clinch();
    }
}

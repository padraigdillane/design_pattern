package state;

//import strategy.after.PlayerBoxer;
import factory.IBoxer;

public interface PlayerBoxerState {
    void action(IBoxer boxer);
}

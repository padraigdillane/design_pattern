package strategy.after;


import state.PlayerBoxerState;

public class Attack implements IBoxerStrategy {

    @Override
    public void cornerManShout(int playerHealth) {
        System.out.println("Player Health:"+playerHealth + "\nCornerman advice: Knock his head off!");
    }


}

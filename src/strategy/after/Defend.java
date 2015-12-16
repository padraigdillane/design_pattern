package strategy.after;

public class Defend implements IBoxerStrategy {

    @Override
    public void cornerManShout(int playerHealth) {
        if(playerHealth <=0){
            System.out.println("Player Health:"+playerHealth + "\nCornerman: NOT AGAIN!");
        }

        else{
            System.out.println("Player Health:"+playerHealth + "\nCornerman advice: Block him or Clinch");
        }

    }
}

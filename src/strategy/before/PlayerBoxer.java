package strategy.before;

public class PlayerBoxer implements IBoxer {
    private int health = 100;

    @Override
    public void decreasePlayerHealth(int amount) {
        health -= amount;
    }

    @Override
    public int getHealth() {
        return health;
    }

    // replace with startegy
    @Override
    public String action(){

       if(health >= 50){
           return "attack";
       }


        if(health >= 30 && health < 49){
            return "be cautious";
        }


        if(health > 0 && health < 29){
            return "defend";
        }

        return "KO'd";

    }
}

package strategy.before;

public interface IBoxer {
    void incHealth(int amount);
    void decHealth(int amount);
    int getHealth();
    String move(); //action away/action in for kill
}

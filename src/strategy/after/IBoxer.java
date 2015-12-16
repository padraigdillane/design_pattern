package strategy.after;

public interface IBoxer {
    void incHealth(int amount);
    void decHealth(int amount);
    int getHealth();
    String move(); //move away/move in for kill
}

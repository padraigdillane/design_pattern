package strategy.before;

public interface IBoxer {
    void decreasePlayerHealth(int amount);
    int getHealth();
    String action();
}

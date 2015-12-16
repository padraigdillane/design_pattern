package strategy.after;

public interface IBoxer {
    void decreasePlayerHealth(int amount);
    int getHealth();
    void attacking();
    void jab();
    void hook();
    void uppercut();
    void survive();
    void block();
    void knockedOut();
    void clinch();
    void cautious();
}

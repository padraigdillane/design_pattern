package factory;

public interface IBoxer {
    String getWeight();
    int getPower();
    int getSpeed();
    String boxerDetails();
    void decreasePlayerHealth(int amount);
    int getHealth();
    String attacking();
    void jab();
    void hook();
    void uppercut();
    void survive();
    void block();
    void knockedOut();
    void clinch();
    void cautious();
}

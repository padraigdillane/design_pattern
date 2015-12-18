package factory;


public class HeavyweightBoxer implements IBoxer {
    private int power = 90;
    private int speed = 70;
    private int playerHealth = 100;

    @Override
    public String getWeight() {
        return "Heavy Weight Boxer";
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public String boxerDetails(){
        return String.format("Boxer Details: \nWeight: %-25s  Strength: %-10d Speed %d\n", getWeight(), getPower(), getSpeed());
    }


    @Override
    public void decreasePlayerHealth(int amount) {
        playerHealth -= amount;
    }

    @Override
    public int getHealth() {
        return playerHealth;
    }

    @Override
    public String attacking() {
        return "Light Weight attacking";
    }

    @Override
    public void jab() {
        System.out.println("HW jab");
    }

    @Override
    public void hook() {
        System.out.println("HW Hook");
    }

    @Override
    public void uppercut() {
        System.out.println("Uppercut");
    }

    @Override
    public void survive() {
        System.out.println("Surviving");
    }

    @Override
    public void block() {
        System.out.println("Block");
    }

    @Override
    public void knockedOut() {
        System.out.println("KO'd");
    }

    @Override
    public void clinch() {
        System.out.println("Clinch");
    }

    @Override
    public void cautious() {
        System.out.println("Being Cautious");
    }

    public void print(String action) {
        System.out.println(action);
    }

}

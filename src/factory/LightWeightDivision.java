package factory;

public class LightWeightDivision implements BoxerWeightDivision{
    private int power = 70;
    private int speed = 100;
    @Override
    public String getWeight() {
        return "Light Weight Boxer";
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
        return String.format("Boxer Details\nWeight: %s \nStrength: %d \nSpeed %d", getWeight(), getPower(), getSpeed());
    }
}

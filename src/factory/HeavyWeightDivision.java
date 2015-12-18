package factory;

/**
 * Created by User on 18/12/2015.
 */
public class HeavyWeightDivision implements BoxerWeightDivision{
    private int power = 100;
    private int speed = 70;

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

    @Override
    public String boxerDetails() {
        return null;
    }
}

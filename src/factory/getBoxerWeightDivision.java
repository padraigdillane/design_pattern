package factory;

/**
 * Created by User on 18/12/2015.
 */
public class getBoxerWeightDivision {

    public BoxerWeightDivision getBoxerWeightDivision(String weightType){
        if(weightType == null){
            return null;
        }

        if(weightType.equalsIgnoreCase("Lightweight")){
            return new LightWeightDivision();
        }

        else if(weightType.equalsIgnoreCase("Heavyweight")){
            return new HeavyWeightDivision();
        }

        return null;
    }
}

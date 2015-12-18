package factory;

/**
 * Created by User on 18/12/2015.
 */
public class BoxerType {

    public static final String LIGHTWEIGHT = "lightweight";
    public static final String HEAVYWEIGHT = "Heavyweight";

    public IBoxer getBoxerType(String boxerType){
        if(boxerType == null){
            return null;
        }

        if(boxerType.equalsIgnoreCase(LIGHTWEIGHT)){
            return new LightweightBoxer();
        }

        else if(boxerType.equalsIgnoreCase(HEAVYWEIGHT)){
            return new HeavyweightBoxer();
        }

        return null;
    }

}

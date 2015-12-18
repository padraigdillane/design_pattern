package template;

/**
 * Created by User on 17/12/2015.
 */
public class BadBoxerTraining extends BoxerTraining{
    @Override
    public boolean doCardio() {
        System.out.println("Lying on the couch watching TV");
        return false;
    }

    @Override
    public boolean doWeights() {
        System.out.println("In the pub lifting pints");
        return false;
    }

    @Override
    public boolean doBoxingSession() {
        System.out.println("In bed");
        return false;
    }
}

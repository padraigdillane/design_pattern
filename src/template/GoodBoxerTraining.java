package template;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class GoodBoxerTraining extends BoxerTraining {
    @Override
    public boolean doCardio() {
        System.out.println("Running 10 miles");
        return true;
    }

    @Override
    public boolean doWeights() {
        System.out.println("Lifting weights for an hour");
        return true;
    }

    @Override
    public boolean doBoxingSession() {
        System.out.println("Practice punch combinations");
        return true;
    }

}

package template;

public abstract class BoxerTraining {
    public final void startTrainingSession(){
        startTraing();
        doCardio();
        doWeights();
        doBoxingSession();
        endTraining();
    }

    public abstract boolean doCardio();
    public abstract boolean doWeights();
    public abstract boolean doBoxingSession();

    public void startTraing(){
        System.out.println("Start training");
    }

    public void endTraining(){
        System.out.println("End training");
    }
}

package template;

public class MainBoxerTraining {
    public static void main(String[] args) {
        BoxerTraining goodBoxer = new GoodBoxerTraining();
        goodBoxer.startTrainingSession();
        System.out.println("\n\n");
        BoxerTraining badBoxer = new BadBoxerTraining();
        badBoxer.startTrainingSession();
    }
}

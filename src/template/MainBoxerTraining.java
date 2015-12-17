package template;

public class MainBoxerTraining {
    public static void main(String[] args) {
        BoxerTraining goodBoxer = new GoodBoxer();
        goodBoxer.startTrainingSession();
        System.out.println("\n\n");
        BoxerTraining badBoxer = new BadBoxer();
        badBoxer.startTrainingSession();
    }
}

package template;

public class MainBoxerTraining {
    public static void main(String[] args) {
        System.out.println("Good training routine");
        BoxerTraining goodBoxer = new GoodBoxerTraining();
        goodBoxer.startTrainingSession();
        System.out.println("\n\nBad training routine");
        BoxerTraining badBoxer = new BadBoxerTraining();
        badBoxer.startTrainingSession();
    }
}

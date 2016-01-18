package observer;

public class BoxingFan implements Observer {

    private Subject subject;
    private int observerID = 0;
    private String roundScore = "";
    private static int observerIDTracker = 0;


    public BoxingFan(Subject subject) {

        this.subject = subject;
        this.observerID =  ++observerIDTracker;
        System.out.println("New Observer: " + this.observerID);
        subject.register(this);
    }

    @Override
    public void update(String score) {
        this.roundScore = score;
        printTheScore();

    }

    public void printTheScore(){
        System.out.println(observerID + "\nScore: " + roundScore);
    }


}

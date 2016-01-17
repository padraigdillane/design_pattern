package observer;
import java.util.List;

public class FightScore implements Subject{

    private String roundScore;
    private List<Observer> observers;

    public FightScore(List<Observer> observerList){
        this.observers = observerList;
    }

    @Override
    public void register(Observer addObserver) {
        observers.add(addObserver);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            System.out.println("Round Score");
            observer.update(roundScore);
        }
    }

    public void setRoundScore(String newScore){
        this.roundScore = newScore;
        notifyObserver();
    }
}

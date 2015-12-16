package strategy.after;

import state.CautiousState;
import state.HealthyState;
import state.KnockedOutState;
import state.SurvivalState;

public class MainBoxingMatch {
    public static void main(String[] args) {

        System.out.println("***Round 3***");
        BoxingMatchSituation boxerWinning = new BoxingMatchSituation(new Attack());
        boxerWinning.adjustCornerManAdvice(100);
        boxerWinning.setPlayerBoxerState(new HealthyState());
        boxerWinning.getBoxerAction();

        System.out.println("\n\n***Round 5***");
        BoxingMatchSituation boxerDoingOK = new BoxingMatchSituation(new Cautious());
        boxerDoingOK.adjustCornerManAdvice(60);
        boxerDoingOK.setPlayerBoxerState(new CautiousState());
        boxerDoingOK.getBoxerAction();

        System.out.println("\n\n***Round 8***");
        BoxingMatchSituation boxerLosing = new BoxingMatchSituation(new Defend());
        boxerLosing.adjustCornerManAdvice(30);
        boxerLosing.setPlayerBoxerState(new SurvivalState());
        boxerLosing.getBoxerAction();

        System.out.println("\n\n***Round 10***");
        BoxingMatchSituation boxerInTrouble = new BoxingMatchSituation(new Defend());
        boxerInTrouble.adjustCornerManAdvice(10);
        boxerInTrouble.setPlayerBoxerState(new KnockedOutState());
        boxerInTrouble.getBoxerAction();


    }
}

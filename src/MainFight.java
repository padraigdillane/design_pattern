import factory.IBoxer;
import factory.BoxerType;
import state.CautiousState;
import state.HealthyState;
import state.KnockedOutState;
import state.SurvivalState;
import strategy.after.Attack;
import strategy.after.BoxingMatchSituation;
import strategy.after.Cautious;
import strategy.after.Defend;


public class MainFight {
    public static void main(String[] args) {

        System.out.println("***Round 3***");

        BoxerType boxerType = new BoxerType();

        System.out.println("Please Select Boxer weight division");
        //boxerWeights value = boxerWeights.values()[br.];
       //String b = br.readLine();

        IBoxer boxer = boxerType.getBoxerType("Lightweight");
        System.out.println(boxer.boxerDetails());

        BoxingMatchSituation boxerWinning = new BoxingMatchSituation(new Attack(),boxer);
        boxerWinning.adjustCornerManAdvice(boxer.getHealth());
        boxerWinning.setPlayerBoxerState(new HealthyState());
        boxerWinning.getBoxerAction();

        System.out.println("\n\n***Round 5***");
        boxer.decreasePlayerHealth(40);
        BoxingMatchSituation boxerDoingOK = new BoxingMatchSituation(new Cautious(),boxer);
        boxerDoingOK.adjustCornerManAdvice(boxer.getHealth());
        boxerDoingOK.setPlayerBoxerState(new CautiousState());
        boxerDoingOK.getBoxerAction();

        System.out.println("\n\n***Round 8***");
        boxer.decreasePlayerHealth(20);
        BoxingMatchSituation boxerLosing = new BoxingMatchSituation(new Defend(),boxer);
        boxerLosing.adjustCornerManAdvice(boxer.getHealth());
        boxerLosing.setPlayerBoxerState(new SurvivalState());
        boxerLosing.getBoxerAction();

        System.out.println("\n\n***Round 10***");
        boxer.decreasePlayerHealth(40);
        BoxingMatchSituation boxerInTrouble = new BoxingMatchSituation(new Defend(),boxer);
        boxerInTrouble.adjustCornerManAdvice(boxer.getHealth());
        boxerInTrouble.setPlayerBoxerState(new KnockedOutState());
        boxerInTrouble.getBoxerAction();


    }
}

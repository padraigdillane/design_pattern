import factory.IBoxer;
import factory.BoxerType;
import observer.BoxingFan;
import observer.FightScore;
import state.CautiousState;
import state.HealthyState;
import state.KnockedOutState;
import state.SurvivalState;
import strategy.after.Attack;
import strategy.after.BoxingMatchSituation;
import strategy.after.Cautious;
import strategy.after.Defend;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFight {
    public static void main(String[] args) {

        MainFight mainFight = new MainFight();

        String boxerChoice = mainFight.getUserBoxerSelection();

        BoxerType boxerType = new BoxerType();
        IBoxer boxer = boxerType.getBoxerType(boxerChoice);

        mainFight.executeFight(boxer);
    }

    private String getUserBoxerSelection() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select boxer weight division - Type Lightweight or Heavyweight");
        String boxerChoice = scanner.next();
        while (!boxerChoice.equalsIgnoreCase("lightweight") && !boxerChoice.equalsIgnoreCase("heavyweight")) {
            System.out.println("Invalid choice - Please select boxer weight division - Type Lightweight or Heavyweight");
            boxerChoice = scanner.next();
        }
        return boxerChoice;
    }

    private void executeFight(IBoxer boxer) {
        System.out.println("***Round 3***");
        BoxingMatchSituation boxerWinning = new BoxingMatchSituation(boxer, new Attack());
        boxerWinning.adjustCornerManAdvice(boxer.getHealth());
        boxerWinning.setPlayerBoxerState(new HealthyState());
        boxerWinning.getBoxerAction();
        FightScore fightScore = new FightScore(new ArrayList<>());
        BoxingFan boxingFan1 = new BoxingFan(fightScore);
        BoxingFan boxingFan2 = new BoxingFan(fightScore);
        BoxingFan boxingFan3 = new BoxingFan(fightScore);
        fightScore.setRoundScore("9-10");

        System.out.println("\n\n***Round 5***");
        boxer.decreasePlayerHealth(40);
        BoxingMatchSituation boxerDoingOK = new BoxingMatchSituation(boxer, new Cautious());
        boxerDoingOK.adjustCornerManAdvice(boxer.getHealth());
        boxerDoingOK.setPlayerBoxerState(new CautiousState());
        boxerDoingOK.getBoxerAction();
        fightScore.setRoundScore("8-10");

        System.out.println("\n\n***Round 8***");
        boxer.decreasePlayerHealth(20);
        BoxingMatchSituation boxerLosing = new BoxingMatchSituation(boxer, new Defend());
        boxerLosing.adjustCornerManAdvice(boxer.getHealth());
        boxerLosing.setPlayerBoxerState(new SurvivalState());
        boxerLosing.getBoxerAction();
        fightScore.setRoundScore("8-10");


        System.out.println("\n\n***Round 10***");
        boxer.decreasePlayerHealth(40);
        BoxingMatchSituation boxerInTrouble = new BoxingMatchSituation(boxer, new Defend());
        boxerInTrouble.adjustCornerManAdvice(boxer.getHealth());
        boxerInTrouble.setPlayerBoxerState(new KnockedOutState());
        boxerInTrouble.getBoxerAction();
        fightScore.unregister(boxingFan1);
        fightScore.setRoundScore("Fight Over - Ali wins via KO");
    }
}

package observer;

import java.util.ArrayList;

public class mainScore {
    public static void main(String[] args) {
        FightScore fightScore = new FightScore(new ArrayList<>());

        BoxingFan boxingFan = new BoxingFan(fightScore);
        BoxingFan boxingFan1 = new BoxingFan(fightScore);
        BoxingFan boxingFan2 = new BoxingFan(fightScore);

        fightScore.setRoundScore("9-10");
        fightScore.setRoundScore("8-10");
        fightScore.setRoundScore("Fight over");


        fightScore.unregister(boxingFan);
        fightScore.unregister(boxingFan1);

        fightScore.setRoundScore("xvdfd");


    }
}

package strategy.after;

public class MainBoxingMatch {
    public static void main(String[] args) {

        BoxingMatchSituation boxingMatchSituation1 = new BoxingMatchSituation(new Attack());
        boxingMatchSituation1.adjustBoxerMovement(100);

        BoxingMatchSituation boxingMatchSituation2 = new BoxingMatchSituation(new Defend());
        boxingMatchSituation2.adjustBoxerMovement(60);

        BoxingMatchSituation boxingMatchSituation3 = new BoxingMatchSituation(new Cautious());
        boxingMatchSituation3.adjustBoxerMovement(10);

    }
}

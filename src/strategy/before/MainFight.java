package strategy.before;

public class MainFight {
    public static void main(String[] args) {
        PlayerBoxer pa_da_man = new PlayerBoxer();

        System.out.println(pa_da_man.getHealth() +" "+ pa_da_man.action());
        pa_da_man.decreasePlayerHealth(20);

        System.out.println(pa_da_man.getHealth() + " " +pa_da_man.action());
        pa_da_man.decreasePlayerHealth(20);

        System.out.println(pa_da_man.getHealth() + " " + pa_da_man.action());
        pa_da_man.decreasePlayerHealth(20);

        System.out.println(pa_da_man.getHealth() +" "+ pa_da_man.action());
        pa_da_man.decreasePlayerHealth(20);

        System.out.println(pa_da_man.getHealth() +" "+ pa_da_man.action());
        pa_da_man.decreasePlayerHealth(20);

        System.out.println(pa_da_man.getHealth() +" " +  pa_da_man.action());

    }
}

package strategy.before;

public class MainFight {
    public static void main(String[] args) {
        PlayerBoxer pa_da_man = new PlayerBoxer();

        System.out.println(pa_da_man.getHealth() +" "+ pa_da_man.move());
        pa_da_man.decHealth(20);

        System.out.println(pa_da_man.getHealth() + " " +pa_da_man.move());
        pa_da_man.decHealth(20);

        System.out.println(pa_da_man.getHealth() + " " + pa_da_man.move());
        pa_da_man.decHealth(20);

        System.out.println(pa_da_man.getHealth() +" "+ pa_da_man.move());
        pa_da_man.decHealth(20);

        System.out.println(pa_da_man.getHealth() +" "+ pa_da_man.move());
        pa_da_man.decHealth(20);

        System.out.println(pa_da_man.getHealth() +" " +  pa_da_man.move());

    }
}

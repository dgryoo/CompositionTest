import thing.Dragon;
import thing.Hero;

public class Play {

    public static void main(String[] args) {

        Dragon dragon = new Dragon();
        Hero hero = new Hero();

        dragon.attack(hero);
        hero.attack(dragon);


    }

}

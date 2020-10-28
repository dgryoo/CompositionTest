import action.attack.Attackable;
import thing.Ash;
import thing.Dragon;
import thing.Thing;

public class Play {

    public static void main(String[] args) {

        Ash ash = new Ash();
        Dragon dragon = new Dragon();

        ash.attackinit(dragon);
        dragon.attackinit(ash);




    }

}

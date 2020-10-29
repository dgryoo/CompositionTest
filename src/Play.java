import thing.Ash;
import thing.Dragon;

public class Play {

    public static void main(String[] args) {

        Ash ash = new Ash();
        Dragon dragon = new Dragon();

        ash.attackinit(dragon);
        dragon.attackinit(ash);
        //TODO getClass.simpleName.toString 이용하여 Util만들기
        System.out.println(ash.getClass().getSimpleName().toString());


    }

}

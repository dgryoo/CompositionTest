package thing;

import action.attack.Attack;
import action.attack.BowAttack;
import inter.*;

public class Ash extends Thing implements AttackableTest {
    int power = 10;
    Attack attack = new BowAttack();

    public Ash() {
        super("Ash", 100, 10, 10);
    }


    @Override
    public void attack(Thing thing) {
        attack.attack(this.power, thing);
    }
}

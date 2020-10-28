package thing;

import action.attack.Attackable;
import action.attack.attacks.AshAttack;
import action.attack.attacks.AttackBehavior;


public class Ash extends Thing implements Attackable {
    int power = 10;
    AttackBehavior attackBehavior = new AshAttack();

    public Ash() {
        super("Ash", 100, 10, 10);
    }


    @Override
    public void attackinit(Thing thing) {
        attackBehavior.attack(power, thing);
    }

    @Override
    public boolean isAttack() {
        return false;
    }
}

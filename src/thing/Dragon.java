package thing;

import action.attack.Attackable;
import action.attack.attacks.AshAttack;
import action.attack.attacks.AttackBehavior;
import action.attack.attacks.DragonAttack;


public class Dragon extends Thing implements Attackable {
    int power = 15;
    AttackBehavior attackBehavior = new DragonAttack();

    public Dragon() {
        super("Dragon", 100, 20, 20);
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

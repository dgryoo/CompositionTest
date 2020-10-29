package thing;

import action.attack.Attackable;
import action.attack.attacks.AshAttack;
import action.attack.attacks.AttackBehavior;
import util.BasicAbility;


public class Ash extends Thing implements Attackable {
    int power = 10;
    AttackBehavior attackBehavior = new AshAttack();

    public Ash() {
        super(BasicAbility.Ash.gettName(), BasicAbility.Ash.getMaxHealth(), BasicAbility.Ash.getArmor(), BasicAbility.Ash.getMagicArmor());
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

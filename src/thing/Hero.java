package thing;

import inter.Attackable;
import inter.AttackableThing;

public class Hero extends Thing implements Attackable {

    private AttackableThing attackableThing = new AttackableThing();

    public Hero() {
        super("Hero", 100, 15, 15);
    }

    @Override
    public void attack(Thing thing) {
        attackableThing.heroAttack(thing);
    }

    @Override
    public boolean isAttack(Thing thing) {
        return true;
    }


}

package thing;

import inter.Attackable;
import inter.AttackableThing;

public class Dragon extends Thing implements Attackable {

    private AttackableThing attackableThing = new AttackableThing();

    public Dragon() {
        super("Dragon", 100, 10, 10);
    }


    @Override
    public void attack(Thing thing) {
        attackableThing.dragonAttack(thing);
    }

    @Override
    public boolean isAttack(Thing thing) {
        return true;
    }

}

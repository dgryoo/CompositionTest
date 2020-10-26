package inter;

import thing.Thing;

public class AttackableThing implements Attackable {

    @Override
    public void attack(Thing thing) {

    }

    @Override
    public boolean isAttack(Thing thing) {
        return false;
    }

    public void dragonAttack(Thing thing) {
        thing.attacked(60);
        System.out.println("Dragon' s Attack!!");
    }

    public void heroAttack(Thing thing) {
        thing.attacked(50);
        System.out.println("Hero's Attack!!");
    }
}

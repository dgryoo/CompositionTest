package action.attack.attacks;

import thing.Thing;

public abstract class AttackBehavior {

    public void attack(int power, Thing thing) {
        thing.attacked(power);
    }

}

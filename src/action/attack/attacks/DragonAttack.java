package action.attack.attacks;

import thing.Thing;

public class DragonAttack extends AttackBehavior {

    @Override
    public void attack(int power, Thing thing) {
        super.attack(power, thing);
        System.out.println("Dragon Attack!!");
    }
}

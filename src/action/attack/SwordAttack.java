package action.attack;

import thing.Thing;

public class SwordAttack extends Attack {

    @Override
    public void attack(int power, Thing thing) {
        super.attack(power, thing);
        System.out.println("sword Attack!!");
    }
}

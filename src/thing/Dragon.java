package thing;

import inter.Attackable;
import inter.AttackableThing;
import inter.Movable;
import inter.MovableThing;

public class Dragon extends Thing implements Attackable, Movable {

    private AttackableThing attackableThing = new AttackableThing();
    private MovableThing movableThing = new MovableThing();

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

    @Override
    public void move(Thing thing, int direction) {
        movableThing.move(this, direction);
    }

    public void move(int direction) {
        movableThing.move(this, direction);
    }
}

package inter;


import thing.Thing;

public interface Attackable {

    void attack(Thing thing);

    boolean isAttack(Thing thing);

}

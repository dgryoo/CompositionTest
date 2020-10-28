package action.attack;


import thing.Thing;

public interface Attackable {

    void attackinit(Thing thing);

    default boolean isAttack() {

        return true;
    };

}

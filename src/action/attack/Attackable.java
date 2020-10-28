package action.attack;


public interface Attackable {

    void attack();

    default boolean isAttack() {

        return true;
    };

}

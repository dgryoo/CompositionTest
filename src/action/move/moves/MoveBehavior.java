package action.move.moves;

import thing.Thing;

public class MoveBehavior {

    public void moveUnit(Thing thing, int direction) {
        System.out.print(thing.getX() + ", " + thing.getY() );
        thing.setX(thing.getX() + 1);
        thing.setY(thing.getY() + 1);
        System.out.print(thing.getX() + "," + thing.getY());

    }

}

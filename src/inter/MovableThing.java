package inter;

import thing.Thing;

public class MovableThing implements Movable{

    @Override
    public void move(Thing thing, int direction) {
        switch (direction) {
            case 4 :
                thing.setX(thing.getX() -1 );
            case 6 :
                thing.setX(thing.getX() +1 );
        }
    }
}

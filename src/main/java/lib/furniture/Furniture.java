package lib.furniture;

import lib.Location;
import people.Human;
import physical.PhysicalObject;

public abstract class Furniture extends PhysicalObject {

    public Furniture(Human owner, Location location) {
        super(owner, location);
    }
}

package lib.furniture;

import lib.Location;
import people.Human;

public abstract class OutdoorFurniture extends Furniture {
    public OutdoorFurniture(Human owner, Location location) {
        super(owner, location);
    }
}

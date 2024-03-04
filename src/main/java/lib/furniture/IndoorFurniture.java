package lib.furniture;

import lib.Location;
import people.Human;

public abstract class IndoorFurniture extends Furniture {
    public IndoorFurniture(Human owner, Location location) {
        super(owner, location);
    }
}

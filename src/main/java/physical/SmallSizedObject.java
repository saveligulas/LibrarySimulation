package physical;

import lib.Location;
import people.Human;

public abstract class SmallSizedObject extends PhysicalObject {
    public SmallSizedObject(Human owner, Location location) {
        super(owner, location);
    }
}

package manager;

import lib.Location;
import physical.PhysicalObject;

public final class RelationManager {
    public static void addLocationPhysicalObjectRelation(Location location, PhysicalObject physicalObject) {
        try {
            location.addPhysicalObject(physicalObject);
            physicalObject.setLocation(location);
        } catch (IllegalArgumentException e) {
            System.out.println("Operation failed: " + location + " with "+ physicalObject);
        }
    }
}

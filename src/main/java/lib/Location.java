package lib;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import physical.PhysicalObject;

import java.util.ArrayList;

@Getter
@AllArgsConstructor
public class Location {
    @Getter(AccessLevel.NONE)
    private static final ArrayList<String> UNIQUE_LOCATION_NAMES = new ArrayList<>();
    private final ArrayList<PhysicalObject> allObjects = new ArrayList<>();
    private String name;

    public void setName(String name) {
        if (UNIQUE_LOCATION_NAMES.contains(name)) {
            throw new IllegalArgumentException("Name already exists");
        }
        this.name = name;
    }

    public void addPhysicalObject(PhysicalObject physicalObject) {
        if (allObjects.contains(physicalObject)) {
            throw new IllegalArgumentException("Physical objects already exists at this location");
        }
        allObjects.add(physicalObject);
    }
}

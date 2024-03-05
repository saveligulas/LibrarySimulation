package lib;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import physical.PhysicalObject;
import simulation.TimeAffected;
import simulation.TimeSimulator;

import java.util.ArrayList;

@Getter
@AllArgsConstructor
public class Location implements TimeAffected {
    @Getter(AccessLevel.NONE)
    private static final ArrayList<String> UNIQUE_LOCATION_NAMES = new ArrayList<>();
    private final ArrayList<PhysicalObject> allObjects = new ArrayList<>();
    private String name;
    private LocalTime clock;

    public Location(TimeSimulator t, String name, LocalTime clock) {
        this.name = name;
        this.clock = clock;
        assignToTimeSimulator(t);
    }

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

    @Override
    public void simulateTimeInObject(Period period) {
        this.clock = clock.plus(period);
    }

    @Override
    public void assignToTimeSimulator(TimeSimulator t) {
        t.assignObject(this);
    }
}

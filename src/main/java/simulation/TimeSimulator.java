package simulation;

import org.joda.time.Period;

import java.util.ArrayList;

public class TimeSimulator implements TimeAffected {

    private final ArrayList<TimeAffected> allTimeAffectedObjects = new ArrayList<>();

    public void assignObject(TimeAffected object) {
        if (allTimeAffectedObjects.contains(object)) {
            throw new IllegalArgumentException("Object already assigned");
        }
        this.allTimeAffectedObjects.add(object);
    }

    public void simulate(Period period, int repetitions) {
        for (int i = 0; i < repetitions; i++) {
            this.simulateTimeInObject(period);
        }
    }

    @Override
    public void simulateTimeInObject(Period period) {
        for (TimeAffected obj : allTimeAffectedObjects) {
            obj.simulateTimeInObject(period);
        }
    }

    @Override
    public void assignToTimeSimulator(TimeSimulator t) {

    }
}

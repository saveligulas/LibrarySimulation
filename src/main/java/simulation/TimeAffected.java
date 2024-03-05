package simulation;

import org.joda.time.DateTime;
import org.joda.time.Period;

public interface TimeAffected {

    void simulateTimeInObject(Period period);

    void assignToTimeSimulator(TimeSimulator t);

    default void simulateTimePassage(Period period) {
        TimeData.simulatePassageOfTime(period);
        simulateTimeInObject(period);
    }

    default DateTime getCurrentTime() {
        return TimeData.getCurrentDateTime();
    }
}

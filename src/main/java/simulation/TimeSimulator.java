package simulation;

import org.joda.time.DateTime;
import org.joda.time.Period;

public interface TimeSimulator {

    void simulateTimeInObject(Period period);

    default void simulateTimePassage(Period period) {
        TimeData.simulatePassageOfTime(period);
        simulateTimeInObject(period);
    }

    default DateTime getCurrentTime() {
        return TimeData.getCurrentDateTime();
    }
}

package simulation;

import lombok.AccessLevel;
import lombok.Getter;
import org.joda.time.DateTime;
import org.joda.time.Period;


public final class TimeData {
    private final static DateTime START_DATETIME = new DateTime(2000, 1, 1, 0, 0);
    @Getter(AccessLevel.PUBLIC)
    private static DateTime currentDateTime = START_DATETIME;

    public static void simulatePassageOfTime(Period period) {
        currentDateTime = currentDateTime.plus(period);
    }
}

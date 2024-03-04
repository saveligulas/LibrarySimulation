package simulation;

import lombok.AccessLevel;
import lombok.Getter;
import org.joda.time.DateTime;
import org.joda.time.Period;


public final class TimeData {
    @Getter(AccessLevel.PUBLIC)
    private static DateTime currentDateTime = DateTime.now();

    public static void simulatePassageOfTime(Period period) {
        currentDateTime = currentDateTime.plus(period);
    }
}

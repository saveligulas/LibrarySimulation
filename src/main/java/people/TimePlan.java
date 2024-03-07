package people;

import org.joda.time.Hours;
import org.joda.time.Period;
import simulation.TimeAffected;
import simulation.TimeSimulator;

import java.util.HashMap;

public class TimePlan<V> implements TimeAffected {

    private final HashMap<Integer, V> timeMap = new HashMap<>();

//    public TimePlan() {
//        for (int i = 0; i < 24; i++) {
//        }
//    }
//
//    public V getPlan(Hours h) {
//
//    }
//
//    public V getPlan(Integer h) {
//
//    }


    @Override
    public void simulateTimeInObject(Period period) {

    }

    @Override
    public void assignToTimeSimulator(TimeSimulator t) {

    }
}

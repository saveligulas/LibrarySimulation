package people;

import lombok.AllArgsConstructor;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.Years;
import physical.PhysicalObject;
import simulation.TimeData;
import simulation.TimeSimulator;

import java.util.ArrayList;

@AllArgsConstructor
public class Human implements TimeSimulator {

    private final ArrayList<PhysicalObject> ownedPhysicalObjects = new ArrayList<>();
    private String name;
    private LocalDate birthdate;

    public Years getYearsOld() {
        return Years.yearsBetween(this.birthdate, TimeData.getCurrentDateTime().toLocalDateTime());
    }

    @Override
    public void simulateTimeInObject(Period period) {
    }
}

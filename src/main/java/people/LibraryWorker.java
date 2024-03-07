package people;

import exception.InvalidTimeException;
import lib.furniture.Counter;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import manager.OneToOneRelationShip;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

@Getter
@Setter
public class LibraryWorker extends Human {

    private LocalTime workStartTime;
    private LocalTime workEndTime;
    private Counter assignedCounter;
    @Setter(AccessLevel.NONE)
    private LocalTime counterStartTime;
    @Setter(AccessLevel.NONE)
    private LocalTime counterEndTime;

    public LibraryWorker(String name, LocalDate birthdate, LocalTime workStartTime, LocalTime workEndTime) {
        super(name, birthdate);
        this.workStartTime = workStartTime;
        this.workEndTime = workEndTime;
    }

    public void setCounterStartTime(LocalTime counterStartTime) throws InvalidTimeException {
        if (counterStartTime.compareTo(workStartTime) < 0 || counterStartTime.compareTo(workEndTime) >= 0) {
            throw new InvalidTimeException("Invalid counterStartTime");
        }
        this.counterStartTime = counterStartTime;
    }

    public void setCounterEndTime(LocalTime counterEndTime) throws InvalidTimeException {
        if (counterEndTime.compareTo(workStartTime) <= 0 || counterEndTime.compareTo(workEndTime) > 0 || (counterEndTime != null && this.counterStartTime.compareTo(counterEndTime) >= 0)) {
            throw new InvalidTimeException("Invalid counterEndTime");
        }
        this.counterEndTime = counterEndTime;
    }
}

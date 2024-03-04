package physical;

import lib.Location;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;
import people.Human;
import simulation.TimeSimulator;

@Getter
@Setter
public abstract class LibraryObject extends SmallSizedObject implements TimeSimulator {

    private Human borrower = null;
    private DateTime leaseTime = DateTime.now();

    public LibraryObject(Human owner, Location location) {
        super(owner, location);
    }
}

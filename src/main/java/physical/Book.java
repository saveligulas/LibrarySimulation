package physical;

import lib.Location;
import lombok.Getter;
import org.joda.time.Period;
import people.Human;

import java.util.ArrayList;

@Getter
public class Book extends LibraryObject {

    private final String author;
    private final String title;
    private final ArrayList<Chapter> chapters = new ArrayList<>();

    public Book(Human owner, Location location, String author, String title) {
        super(owner, location);
        this.author = author;
        this.title = title;
    }

    @Override
    public void simulateTimeInObject(Period period) {
        super.setLeaseTime(super.getLeaseTime().plus(period));
    }
}

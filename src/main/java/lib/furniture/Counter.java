package lib.furniture;

import lib.Location;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import people.Human;
import people.LibraryWorker;
import physical.SmallSizedObject;
import simulation.TimeAffected;
import simulation.TimeSimulator;

import java.util.ArrayList;
import java.util.NoSuchElementException;

@Getter
@Setter
public class Counter extends IndoorFurniture implements Container, LibraryServiceStation, TimeAffected {

    private final ArrayList<SmallSizedObject> booksAtCounter = new ArrayList<>();
    private LocalTime openingTime;
    private LocalTime closingTime;
    private Location location;
    private LibraryWorker currentWorker = null;

    public Counter(Human owner, Location location, LocalTime openingTime, LocalTime closingTime) {
        super(owner, location);
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    @Override
    public void addItem(SmallSizedObject item) {
        if (booksAtCounter.contains(item)) {
            throw new IllegalArgumentException("Duplicate book");
        }
        booksAtCounter.add(item);
    }

    @Override
    public void removeItem(SmallSizedObject item) {
        try {
            booksAtCounter.remove(item);
        } catch(NoSuchElementException e) {
            System.out.println("Duplicate book at counter: " + this.toString());
        }
    }

    @Override
    public ArrayList<SmallSizedObject> getItems(SmallSizedObject item) {
        return booksAtCounter;
    }

    @Override
    public void simulateTimeInObject(Period period) {

    }

    @Override
    public void assignToTimeSimulator(TimeSimulator t) {
        t.assignObject(this);
    }

    @Override
    public Period getServiceTime() {
        return null;
    }

    @Override
    public LibraryWorker getCurrentLibraryWorker() {
        return null;
    }

    @Override
    public void serviceHuman(Human human) {

    }
}

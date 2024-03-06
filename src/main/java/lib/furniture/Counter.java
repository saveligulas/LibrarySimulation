package lib.furniture;

import exception.ObjectDoesNotExistException;
import lib.Location;
import lombok.Getter;
import lombok.Setter;
import manager.OneToManyRelationShip;
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
public class Counter extends IndoorFurniture implements Container, LibraryServiceStation, OneToManyRelationShip<LibraryWorker> {

    private final ArrayList<SmallSizedObject> booksAtCounter = new ArrayList<>();
    private LocalTime openingTime;
    private LocalTime closingTime;
    private Location location;
    private LibraryWorker currentWorker = null;
    private ArrayList<LibraryWorker> assignedWorkers = new ArrayList<>();

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

    @Override
    public ArrayList<LibraryWorker> getRelationships() {
        return assignedWorkers;
    }

    @Override
    public void addRelationship(LibraryWorker obj) {
        if (assignedWorkers.contains(obj)) {
            throw new IllegalArgumentException("Duplicate relationship");
        }
        this.assignedWorkers.add(obj);
    }

    @Override
    public void removeRelationship(LibraryWorker obj) throws ObjectDoesNotExistException {
        if (!assignedWorkers.contains(obj)) {
            throw new ObjectDoesNotExistException("Counter does not have a relationship with this libraryWorker");
        }
    }

    @Override
    public Class<LibraryWorker> getRelationshipClass() {
        return LibraryWorker.class;
    }
}

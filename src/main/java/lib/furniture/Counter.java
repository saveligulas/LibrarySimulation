package lib.furniture;

import lib.Location;
import people.Human;
import physical.SmallSizedObject;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Counter extends IndoorFurniture implements Container, LibraryServiceStation {

    private final ArrayList<SmallSizedObject> booksAtCounter = new ArrayList<>();

    public Counter(Human owner, Location location) {
        super(owner, location);
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
}

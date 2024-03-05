package lib.furniture;

import org.joda.time.Period;
import people.Human;
import people.LibraryWorker;

public interface LibraryServiceStation {
    Period getServiceTime();
    LibraryWorker getCurrentLibraryWorker();
    void serviceHuman(Human human);
}

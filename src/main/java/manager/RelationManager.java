package manager;

import exception.InvalidTimeException;
import lib.furniture.Counter;
import org.joda.time.LocalTime;
import people.LibraryWorker;

public final class RelationManager {
    public static void assignLibraryWorkerToCounter(LibraryWorker worker, Counter counter, LocalTime start, LocalTime end) {
        if (start.compareTo(end) >= 0 || start.compareTo(counter.getOpeningTime()) < 0 || start.compareTo(counter.getClosingTime()) >= 0 ||
            end.compareTo(counter.getOpeningTime()) <= 0 || end.compareTo(counter.getClosingTime()) > 0) {
            throw new InvalidTimeException("Invalid time period");
        }
        try {
            worker.setCounterStartTime(start);
            worker.setCounterEndTime(end);
            worker.setAssignedCounter(counter);
        } catch (InvalidTimeException e) {
            System.out.println("LibraryWorker could not be assigned");
        }
    }

    public static <T, U> void setRelationship(OneToOneRelationShip<U> relOne, OneToOneRelationShip<T> relTwo) {
        try {
            relOne.setRelationship(relOne.getRelationshipClass().cast(relTwo));
            relTwo.setRelationship(relTwo.getRelationshipClass().cast(relOne));
        } catch (Exception e) {
            System.out.println("Relationship could not be assigned + " + relOne.toString() + " " + relTwo.toString());
            e.printStackTrace();
        }
    }
}

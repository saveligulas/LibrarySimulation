package manager;

import exception.DuplicateObjectException;
import exception.ObjectDoesNotExistException;

import java.util.ArrayList;

public interface OneToManyRelationShip<T> {
    ArrayList<T> getRelationships();
    void addRelationship(T obj) throws DuplicateObjectException;
    void removeRelationship(T obj) throws ObjectDoesNotExistException;
    Class<T> getRelationshipClass();
}

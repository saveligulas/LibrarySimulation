package manager;

public interface OneToOneRelationShip<T> {
    T getRelationship();
    void setRelationship(T obj); //TODO: add exception throws
    Class<T> getRelationshipClass();
}

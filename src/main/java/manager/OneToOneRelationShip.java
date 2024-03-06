package manager;

public interface OneToOneRelationShip<T> {
    T getRelationship();
    void setRelationship(T obj);
    Class<T> getRelationshipClass();
}

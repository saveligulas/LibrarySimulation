package manager;

import javax.management.relation.Relation;

public class TestClassRelationTwo implements OneToOneRelationShip<TestClassRelationOne> {

    TestClassRelationOne field;

    @Override
    public TestClassRelationOne getRelationship() {
        return field;
    }

    @Override
    public void setRelationship(TestClassRelationOne obj) {
        field = obj;
    }

    @Override
    public Class<TestClassRelationOne> getRelationshipClass() {
        return TestClassRelationOne.class;
    }
}

package manager;

public class TestClassRelationOne implements OneToOneRelationShip<TestClassRelationTwo> {
    TestClassRelationTwo field;
    @Override
    public TestClassRelationTwo getRelationship() {
        return field;
    }

    @Override
    public void setRelationship(TestClassRelationTwo obj) {
        field = obj;

    }

    @Override
    public Class<TestClassRelationTwo> getRelationshipClass() {
        return TestClassRelationTwo.class;
    }
}

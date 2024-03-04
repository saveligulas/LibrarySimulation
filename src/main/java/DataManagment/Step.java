package DataManagment;

import java.util.ArrayList;

public class Step {
}

class Person {
    private ArrayList<Person> colleagues;
    private String name;
    private Long id;
    private ArrayList<String> phoneNumbers;
    private String email;
}

class Academic extends Person implements TeamLeader {}

interface TeamLeader {}
interface OfficialInstitution {}

class Team {
    private ArrayList<Person> members;
    private TeamLeader teamLeader;
}

class Department {
    private ArrayList<Team> teams;
}

class University implements OfficialInstitution {
    private ArrayList<Department> departments;
}
class Department {
    private String manager = "Ing. Romero";
    public String getManager() { return manager; }
}

public class Person {
    private Department department = new Department();

    public Department getDepartment() {
        return department;
    }
}

class Client {
    public void printManager(Person person) {
        System.out.println("Manager: " + person.getDepartment().getManager());
    }
}

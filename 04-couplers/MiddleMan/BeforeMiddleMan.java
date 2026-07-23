class Department {
    private String manager = "Ing. Romero";
    public String getManager() { return manager; }
}

public class Person {
    private Department department = new Department();

    public String getManager() {
        return department.getManager();
    }
}

class Client {
    public void printManager(Person person) {
        System.out.println("Manager: " + person.getManager());
    }
}

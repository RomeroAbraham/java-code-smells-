public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.10;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
}

class EmployeeReportGenerator {
    public String generatePdfReport(Employee employee) {
        return "PDF Report for " + employee.getName() + " with salary $" + employee.getSalary();
    }
}

class EmployeeRepository {
    public void save(Employee employee) {
        System.out.println("INSERT INTO employees VALUES ('" + employee.getName() + "', " + employee.getSalary() + ")");
    }
}

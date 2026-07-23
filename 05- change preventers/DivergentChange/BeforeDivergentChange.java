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

    public String generatePdfReport() {
        return "PDF Report for " + name + " with salary $" + salary;
    }

    public void saveToDatabase() {
        System.out.println("INSERT INTO employees VALUES ('" + name + "', " + salary + ")");
    }
}

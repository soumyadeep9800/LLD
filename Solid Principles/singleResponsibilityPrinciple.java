/*
A class or function or modules should have only one reason to change.A class or function
or modules should have only one responsibility.Gather together the things that change for
the same reasons. Separate things that change for different reasons.Each module should do
one thing and do it well
 */

/*
❌ Violating SRP (Bad Design) Holding employee data,Generating a report
public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public int getId() { return id; }

    // Violates SRP
    public void generateReport() {
        System.out.println("Generating report for: " + name);
    }

✅ Example of SRP in Java (Good Design)
// Class 1: Handles employee data
public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    // Getters
    public String getName() { return name; }
    public int getId() { return id; }
}
// Class 2: Handles report generation
public class ReportGenerator {
    public void generateReport(Employee employee) {
        System.out.println("Generating report for: " + employee.getName());
    }
}
 */
// public class singleResponsibilityPrinciple {
    
// }

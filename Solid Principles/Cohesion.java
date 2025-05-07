
//Low Cohesion-In this version, a single class EmployeeManager handles multiple
//unrelated responsibilities — managing employee data, calculating salary, and printing reports.
/*
    class EmployeeManager {
    // Employee data management
    public void addEmployee(String name) {
        System.out.println("Employee " + name + " added");
    }
    // Salary calculation
    public double calculateSalary(String name, int hoursWorked) {
        return hoursWorked * 100.0;
    }
    // Reporting
    public void generateReport(String name) {
        System.out.println("Generating report for " + name);
    }
}


high cohesion-Follows Single Responsibility Principle from SOLID.
// Employee data management
class EmployeeService {
    public void addEmployee(String name) {
        System.out.println("Employee " + name + " added");
    }
}
// Salary calculation
class SalaryCalculator {
    public double calculateSalary(String name, int hoursWorked) {
        return hoursWorked * 100.0;
    }
}
// Reporting
class ReportGenerator {
    public void generateReport(String name) {
        System.out.println("Generating report for " + name);
    }
}
 */

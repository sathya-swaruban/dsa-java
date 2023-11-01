package Exercises;

import java.util.*;

class Employee {
    private String employeeId;
    private String employeeName;
    private int salary;
    private int jobLevel;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(int jobLevel) {
        this.jobLevel = jobLevel;
    }

    public void calculateSalary() {
        int bonus;
        if (this.jobLevel >= 4) {
            bonus = 100;
        } else {
            bonus = 50;
        }
        this.salary += bonus;
    }
}

class Tester3 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeId("C101");
        employee.setEmployeeName("Steve");
        employee.setSalary(650);
        employee.setJobLevel(4);

        employee.calculateSalary();

        System.out.println("Employee Details");
        System.out.println("Employee Id: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getSalary());

    }
}
package com.learning.company;

public class EmployeeManagement {
    public static void main(String[] args) {
        //Create a regular employee
        Employee emp = new Employee("John Doe", 150000, 25, "SDE-2");
        emp.displayEmployeeDetails();

        //Create a manager
        Manager mgr = new Manager("Carl Bennet", 190000, 28, "Associate Manager", 300000);
        mgr.displayEmployeeDetails();

        emp.setSalary(155000);
        mgr.setBudget(340000);
        mgr.setSalary(210000);

        //Display new details
        emp.displayEmployeeDetails();
        mgr.displayEmployeeDetails();
    }
}
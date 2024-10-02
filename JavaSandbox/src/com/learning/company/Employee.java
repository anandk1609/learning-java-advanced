package com.learning.company;

public class Employee {
    private String name;
    private double salary;
    private int age;
    protected String position;

    //Constructor
    public Employee(String name, double salary, int age, String position) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0) {
            this.salary = salary;
        }
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    //Method to calculate yearly bonus
    public double calculateBonus() {
        return salary * 0.10;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " +name);
        System.out.println("Position: " +position);
        System.out.println("Salary: " +salary);
        System.out.println("Age: " +age);
        System.out.println("Bonus: " +calculateBonus());
    }   
}
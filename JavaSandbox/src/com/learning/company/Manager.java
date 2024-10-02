package com.learning.company;

public class Manager extends Employee {
    private double budget;

    //Constructor
    public Manager(String name, double salary, int age, String position, double budget) {
        super(name, salary, age, position);
        this.budget = budget;
    }
   
    //Getters and Setters
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        if(budget > 0) {
            this.budget = budget;
        }
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Budget: $" +budget);
    }
}

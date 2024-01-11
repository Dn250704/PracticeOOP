package com.Abstract_Interface;

import java.util.Scanner;

interface BonusCalculate {
    double calculateBonus();
}

public abstract class Employee {
    private String Name;
    private double Salary;

    public Employee(String name, double salary) {
        Name = name;
        Salary = salary;
    }

    // Getter and setter
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public double getSalary() {
        return Salary;
    }
    public void setSalary(double salary) {
        Salary = salary;
    }

    abstract void displayDetail();
}

class Manager extends Employee implements BonusCalculate {
    private double bonusPercentage;

    public Manager(String name, double salary, double bonusPercentage) {
        super(name, salary);
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    void displayDetail() {
        System.out.println("Manager Details: ");
        System.out.println("Name: " + getName());
        System.out.println("Salary: $" + getSalary());
    }

    @Override
    public double calculateBonus() {
        return getSalary() * (bonusPercentage / 100);
    }
}

class Ex7 {
    public static void main(String[] args) {
        System.out.print("Enter name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter salary: ");
        double salary = new Scanner(System.in).nextDouble();
        double bonus = 0;
        if (salary > 10000000) {
            bonus = 2000000;
        } else if ( salary > 5000000 && salary < 10000000) {
            bonus = 1000000;
        } else if ( salary < 5000000 ) {
            bonus = 500000;
        }
        Manager manager = new Manager(name, salary, bonus);
        manager.displayDetail();
        System.out.println("Bonus: $" + manager.calculateBonus());
    }
}
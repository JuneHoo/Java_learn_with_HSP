package com.edu.SmallChangeMoney;

public class Exercise04 {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Tom", 80.2, 24, 1.2);
        manager1.setBonus(1233);
        manager1.printSal();
    }
}

class Employee {
    private String name;
    private double daySalary;
    private int workDays;

    private double grade;

    // print the salary
    public void printSal() {
        System.out.println(name + "'s total salary is:" + daySalary * workDays * grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public Employee(String name, double daySalary, int workDays, double grade) {
        this.name = name;
        this.daySalary = daySalary;
        this.workDays = workDays;
        this.grade = grade;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}


class Manager extends Employee {

    // specific feature:
    private double bonus;

    public Manager(String name, double daySalary, int workDays, double grade) {
        super(name, daySalary, workDays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void printSal() {
        // Because manager and employee have different calculate ways.
//        super.printSal();
        System.out.println("Manager " + getName() + "'s Salary is " + (getDaySalary()*getWorkDays()*getGrade() + getBonus()));

    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
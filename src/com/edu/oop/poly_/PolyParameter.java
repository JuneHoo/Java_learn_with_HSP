package com.edu.oop.poly_;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("Tom", 2000);
        Manager miller = new Manager("Miller", 7000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(miller);

        polyParameter.testWork(tom);
        polyParameter.testWork(miller);

    }

    public void showEmpAnnual(Employee employee) {
        System.out.println(employee.getAnnual());
    }

    // 添加一个方法 testWorker 如果是普通员工 则调用work方法 如果是经理调用manager方法
    public void testWork(Employee employee) {
        if (employee instanceof Worker) {
            ((Worker) employee).work();
        } else if (employee instanceof Manager) {
            ((Manager) employee).manage();
        }
    }


}

class Employee {
    private String name;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getAnnual() {
        return 12 * salary;
    }

}

class Worker extends Employee {

    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work() {
        System.out.println("Worker " + getName() + " is working");
    }

    public double getAnnual() {
        return super.getAnnual();
    }
}

class Manager extends Employee {
    private double bonus;
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void manage() {
        System.out.println("Manager " + getName() + " is managing");
    }

    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
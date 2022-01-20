package com.edu.generic_;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 20000, new MyDate(2000, 11, 11)));
        employees.add(new Employee("jack", 12000, new MyDate(2001, 12, 33)));
        employees.add(new Employee("jelly", 12000, new MyDate(2001, 11, 33)));
        employees.add(new Employee("hsp", 120000, new MyDate(1988, 12, 33)));
        System.out.println(employees);
        System.out.println("=========对雇员进行排序===============");

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                // 先按照name排序 如name相同 则按生日日期的先后排序
                // 先对传入的参数进行验证
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    System.out.println("类型不正确！");
                    return 0;
                }
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0) {
                    return i;
                }
                // 如果name相同 就比较birthday - year
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });


        System.out.println("排序后：");
        System.out.println(employees);
    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;

    public int compareTo(MyDate o) {
        int yearMinus = year - o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }
        int monthMinus = month - o.getMonth();
        if (monthMinus != 0) {
            return monthMinus;
        }
        return day - o.getDay();

    }
    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
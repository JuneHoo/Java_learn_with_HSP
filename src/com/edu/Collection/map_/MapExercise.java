package com.edu.Collection.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1, new Emp("jack", 3000, 1));
        hashMap.put(2, new Emp("mary", 30100, 2));
        hashMap.put(3, new Emp("tom", 30002, 3));
        Set keySet = hashMap.keySet();
        System.out.println("==========1=======================");
        for (Object obj : keySet) {
             Emp emp = (Emp) hashMap.get(obj);
            if (emp.getSalary() > 18000) {
                System.out.println(emp);
            }
        }

        System.out.println("==========2=========================");
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Emp emp = (Emp) entry.getValue();
            if (emp.getSalary() > 19000) {
                System.out.println(emp);
            }

        }
    }
}

class Emp {
    private String name;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    private int salary;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Emp(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}
package com.edu.generic_;

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {
        // Using generic put 3 students into the hashmap
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("Jack", 13));
        students.add(new Student("Jerry", 15));
        students.add(new Student("Tom", 18));

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("=======================================");
        // Using HashMap

        HashMap<String, Student> hm = new HashMap<String, Student>();

        hm.put("Tom", new Student("Tom", 20));
        hm.put("Jack", new Student("Jack", 11));
        hm.put("Jerry", new Student("Jerry", 23));

        // 迭代器：EntrySet
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }
    }
}

class Student {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

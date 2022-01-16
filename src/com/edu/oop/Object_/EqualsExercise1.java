package com.edu.oop.Object_;

public class EqualsExercise1 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 10, 'M');
        Person person3 = new Person("jack", 10, 'M');
        Person person2 = new Person("mike", 12, 'F');
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    // 重写Object 的 equals方法
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Person) {
            Person person = (Person) obj;
            return this.name.equals(person.name) && this.age == this.age
                    && this.gender == person.gender;
        }
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

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
}

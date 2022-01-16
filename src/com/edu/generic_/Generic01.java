package com.edu.generic_;

import java.util.ArrayList;

public class Generic01 {
    // 泛型：Generic
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("Puppy", 11));
        arrayList.add(new Dog("Phebe", 1));
        arrayList.add(new Dog("Kevin", 2));

        // if carelessly added a cat into the arrayList there'll be an error
//        arrayList.add(new Cat("Tom", 9));

        for (Object o : arrayList) {
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "-" + dog.getAge() + "years old");
        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
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

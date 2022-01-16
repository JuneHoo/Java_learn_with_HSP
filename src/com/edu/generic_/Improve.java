package com.edu.generic_;

import java.util.ArrayList;
import java.util.List;

public class Improve {
    public static void main(String[] args) {
        // Using generic to improve the Generic01
        // If compiler find that the added type is invalid like 'Cat'
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("Puppy", 11));
        arrayList.add(new Dog("Phebe", 1));
        arrayList.add(new Dog("Kevin", 2));
//        arrayList.add(new Cat("Tom", 9));
        for (Dog dog : arrayList) {
//            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "-" + dog.getAge());
        }
        // Adding invalid type can be avoided while using generic(improve the security)
        // Decreasing type transfer time to increase efficiency
        //

        Person<String> person = new Person<String>("UCR STUDENT2021");
        Person<Integer> person1 = new Person<Integer>(123);
    }
}

class Person<T> {
    T t;
    // T is the data type of t, it was specified
    // while defining the person object. During compilation
    // the type of T was determined

    public Person(T t) {
        this.t = t;
    }
    public T f() {
        return t;
    }
}

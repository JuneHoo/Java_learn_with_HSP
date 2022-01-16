package com.edu.Collection.set_;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {
        // HashSet 实现了Set接口 实际上是HashMap
        // 可以存放null值 但只能有一个null
        //

        HashSet hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add("john");
        hashSet.add("john"); // 加入不了
        hashSet.add("tom");
        hashSet.add(new Dog("tom"));
//        hashSet.add(new Dog("tom"));
        System.out.println(hashSet.add(new Dog("tom")));
        System.out.println(        hashSet.add("john"));
        System.out.println("hashSet= " + hashSet);

        hashSet.add(new String("hjy"));
        System.out.println(hashSet.add(new String("hjy")));
        System.out.println(hashSet);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

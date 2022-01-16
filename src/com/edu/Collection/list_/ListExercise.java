package com.edu.Collection.list_;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }

        System.out.println("list=" + list);

        list.add(1, "Edu");
        System.out.println("list=" + list);
        // get the number 5 element
        System.out.println(list.get(5));
        list.remove(6);
        System.out.println(list);
        list.set(6, "三国");
        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}

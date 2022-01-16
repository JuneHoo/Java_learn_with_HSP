package com.edu.Collection.list_;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDetail01 {
    public static void main(String[] args) {
        // ArrayList 效率高 线程不安全
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("tom");
        arrayList.add("jerry");

        System.out.println(arrayList);
    }
}

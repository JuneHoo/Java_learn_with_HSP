package com.edu.Collection.map_;

import java.util.Hashtable;

public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("john", 10);
        table.put("lucy", 100);
        table.put("lic", 109);
        table.put("lic", 88);
        table.put(null, 88); // 报错
        System.out.println(table);
    }
}

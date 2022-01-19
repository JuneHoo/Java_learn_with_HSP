package com.edu.Collection.map_;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        // 继承了HashTable 可以通过k-v存放数据，k-v都不能为空
        Properties properties = new Properties();
        properties.put("john", 100);
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 199);
//        properties.put(null, 100);
//        properties.put(213, null);
        System.out.println(properties);

        System.out.println(properties.get("lic"));

        properties.remove("lic");
        System.out.println(properties);

        System.out.println(properties.getProperty("john"));
    }
}

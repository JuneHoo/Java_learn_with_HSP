package com.edu.reflection_;

import sun.text.resources.cldr.ti.FormatData_ti_ER;

import javax.sql.rowset.FilteredRowSet;
import java.lang.reflect.Method;

/**
 * 反射的使用性能 优化
 */
public class Reflection01 {
    public static void main(String[] args) throws Exception {
        m1();
        m2();
        m3();

    }

    public static void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();

        for (int i = 0; i < 900000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法调用hi使用时间为：" + (end - start));
    }
    public static void m2() throws Exception{
        Class cls = Class.forName("com.edu.reflection_.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");


        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o); // 反射形式调用hi
        }
        long end = System.currentTimeMillis();
        System.out.println("反射调用hi方法使用时间为: " + (end - start));
    }
    // 反射调用优化：


    public static void m3() throws Exception{
        Class cls = Class.forName("com.edu.reflection_.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");

        // 优化
        hi.setAccessible(true); // 方法调用时 取消访问检查

        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o); // 反射形式调用hi
        }
        long end = System.currentTimeMillis();
        System.out.println("优化后 反射调用hi方法使用时间为: " + (end - start));
    }



}


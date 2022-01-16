package com.edu.oop.Object_;

import sun.plugin2.liveconnect.BrowserSideObject;

import javax.naming.event.ObjectChangeListener;

public class Equals_ {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);
        System.out.println(b == a);
        A aObj = new B();
        A bObj = b;
        System.out.println(aObj == c);
        // 只要满足两个对象 运行地址相同即可
        System.out.println(bObj == a);
        System.out.println(bObj == c);
        int num1 = 10;
        double num2 = 10.000;
        System.out.println(num1 == num2); // true

        // equals 只能比较引用数据类型
        /*

        public boolean equals(Object anObject) {
            if (this == anObject) { // 如果是同一个对象
                return true;
            }
            if (anObject instanceof String) { // 判断类型
                String anotherString = (String)anObject;// 向下转型
                int n = value.length;
                if (n == anotherString.value.length) {
                    char v1[] = value;
                    char v2[] = anotherString.value;
                    int i = 0;
                    while (n-- != 0) {
                        if (v1[i] != v2[i])
                            return false;
                        i++;
                    }
                    return true;
                }
            }
            return false;
    }

         */
        System.out.println("hello".equals("hello"));
        System.out.println("===============================");
        Integer integer = new Integer(5);
        /* Integer 也重写了Object的equals方法
        变成了判断两个值是否相同

    public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();
        }
        return false;
    }
         */
        Integer integer1 = new Integer(5);
        // ==可以判断基本数据类型 or 引用数据类型
        System.out.println(integer1 == integer);
        System.out.println(integer1.equals(integer));
        String str1 = new String("edu");
        String str2 = new String("edu");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}


class A {

}

class B extends A {

}
package com.edu.generic_;

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {
        Object obj = new String("xx");
        // 泛型没有继承性
//        List<Object> list = new List<String>();
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AAA> list3 = new ArrayList<>();
        List<BBB> list4 = new ArrayList<>();
        List<CCC> list5 = new ArrayList<>();

        // 如果是List<?> c可以接受任意的泛型类型
         printCollection1(list1);
         printCollection1(list2);
         printCollection1(list3);
         printCollection1(list4);
         printCollection1(list5);
//         printCollection1(list4);
//        printCollection2(list1); // wrong
//        printCollection2(list2); // wrong
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);

        printCollection3(list1);
//        printCollection3(list2);
        printCollection3(list3);
//        printCollection3(list4);
//        printCollection3(list5);

    }

    // List<?>表示 任意的泛型类型都可以接受
    public static void printCollection1(List<?> objects) {
        for (Object object : objects) {
            System.out.println(object);
        }
    }

    public static void printCollection2(List<? extends AAA> objects) {
        for (Object object : objects) {
            System.out.println(object);
        }
    }
    public static void printCollection3(List<? super AAA> objects) {
        for (Object object : objects) {
            System.out.println(object);
        }
    }

}

class AAA {

}

class BBB extends AAA {
}

class CCC extends BBB {
}
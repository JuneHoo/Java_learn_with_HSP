package com.edu.Collection.set_;

import sun.text.resources.cldr.ar.FormatData_ar_QA;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings("all")
public class SetMethod {
    public static void main(String[] args) {
        // 1. 以Set接口的实现类HashSet 使用Set接口的方法
        // 2. set 接口的实现类的对象 不能存放重复的元素 可以添加一个null
        // 3. 存放无序的
        // 4. 注意：取出的顺序虽然不是添加的顺序 但是固定的

        Set set = new HashSet();
        set.add("john");
        set.add("lucy");

        set.add("john");
        set.add("jack");
        set.add("Mary");
        set.add("hjy");
        set.add(null);
        set.add(null);

        System.out.println("set = " + set);
//        for (int i = 0; i < set.size(); i++) {
//            set. 不能通过 索引 + for 遍历
//        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("=============================");
        for (Object o : set) {
            System.out.println(o);
        }
    }


}

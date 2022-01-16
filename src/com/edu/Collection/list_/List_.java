package com.edu.Collection.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList(); // 编译看左边 运行看右边
        // List集合中元素有序 且可以重复
        list.add("jack");
        list.add("mary");
        list.add("tom");
        list.add("jake");
        list.add("tom");
        System.out.println(list);
        System.out.println(list.get(4));

        list.add(1, "jsp");
        System.out.println(list);

        List list2 = new ArrayList();
        list2.add("tom");
        list2.add("jerry");
        list.addAll(list2);
        System.out.println(list);
        System.out.println(list.indexOf("tom"));
//        System.out.println(list.indexOf("tom"));
        System.out.println(list.lastIndexOf("tom"));
        list.remove(1);
        System.out.println(list);
        list.set(1, "Mary");
        System.out.println(list);

    }
}

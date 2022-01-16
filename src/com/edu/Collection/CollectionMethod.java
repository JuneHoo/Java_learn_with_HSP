package com.edu.Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add(10);  // 自动装箱
        list.add(true);

        System.out.println("list=" + list);

        list.remove(0);
        System.out.println("list= " + list);
        list.remove("jack");

        System.out.println(list.contains("jack"));

        System.out.println("length of list is: " + list.size());
        System.out.println(list.isEmpty());

        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
//        list2.add("红楼梦");
        System.out.println(list2);
        list.addAll(list2);
        System.out.println(list);
        list.add("聊斋");
        list.removeAll(list2);
        System.out.println(list);

    }
}

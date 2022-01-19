package com.edu.Collection.set_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        // 当我们使用无参构造器 创建TreeSet时 是有序的 （自动排序！）

        TreeSet treeSet = new TreeSet();

        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");
        System.out.println(treeSet);

        TreeSet treeSet_reverse = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).compareTo((String) o1);
            }
        });
        treeSet_reverse.add("jack");
        treeSet_reverse.add("tom");
        treeSet_reverse.add("sp");
        treeSet_reverse.add("a");
        treeSet_reverse.add("abc");
        System.out.println(treeSet_reverse);
    }
}

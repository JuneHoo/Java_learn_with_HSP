package com.edu.Collection.map_;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {
        // 默认已经 升序排列！
        TreeMap treeMap = new TreeMap();
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("smith", "史密斯");
        treeMap.put("alibaba", "阿里巴巴");

        System.out.println(treeMap);

        // 若要 key 按照字符串长度排序：
        TreeMap t = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (((String) o1).length() - ((String) o2).length());
            }
        });
        t.put("jack", "杰克");
        t.put("tom", "汤姆");
        t.put("smith", "史密斯");
        t.put("alibaba", "阿里巴巴");
        t.put("hjy", "author"); // 这里会把 author 换到tom的value里！
        System.out.println(t);
    }
}

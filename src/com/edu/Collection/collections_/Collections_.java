package com.edu.Collection.collections_;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_ {
    public static void main(String[] args) {
        // 创建ArrayList 用于测试
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("Jerry");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        // 打乱
        Collections.shuffle(list);
        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            Collections.shuffle(list);
            System.out.println(list); // 抽奖游戏
        }
        System.out.println("==============================");
        Collections.sort(list); // 自然排序
        System.out.println(list);
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String) o2).length();
            }
        });
        System.out.println("按照字符串长度大小排序：" + list);

        Collections.swap(list, 0, 1);
        System.out.println(list);
        System.out.println("====================================");

        System.out.println("自然顺序最大元素：" + Collections.max(list));
        Object MaxObject = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println("长度最大元素：" + MaxObject);
        list.add("tom");
        System.out.println("tom的出现次数=" + Collections.frequency(list, "tom"));

        ArrayList arrayList = new ArrayList();
        // 为了完成拷贝 需要先给arrayList赋值 大小和list.length一样
        for (int i = 0; i < list.size(); i++) {
            arrayList.add("");
        }
        Collections.copy(arrayList, list); // 把list copy到arrayList中
        System.out.println(arrayList);
        System.out.println("======================================");
        Collections.replaceAll(list, "tom", "汤姆");
        System.out.println(list);


    }
}

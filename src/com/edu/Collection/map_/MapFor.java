package com.edu.Collection.map_;

import java.util.*;

public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put(null, "六零波");
        map.put("鹿晗", null);

        Set keyset = map.keySet();
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }

        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "- " + map.get(key));
        }

        Collection values = map.values();
        // 这里可以使用所有Collections使用的遍历方法
        for (Object value : values) {
            System.out.println(value);

        }

        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next);
        }
        System.out.println("=========Entry===============");
        // 通过entrySet来获取 k-v !!!
        Set EntrySet = map.entrySet();
        for (Object o : EntrySet) {
            // 将entry 转成 Map.Entry
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        System.out.println("============================");
        Iterator iterator2 = EntrySet.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            System.out.println(next.getClass()); // HashMap$Node 实现了->Map.Entry
        }

    }
}

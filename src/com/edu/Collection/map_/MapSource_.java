package com.edu.Collection.map_;

import com.edu.oop.poly_.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSource_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1", "HSP");
        map.put("no2", "张无忌");
        map.put(new Car(), new Person());

        // 1. k-v最后是HashMap$Node node = newNode(hash, key, value, null)
        // 2. k-v为了方便程序员的遍历，还会 创建EntrySet集合 该集合存放的元素类型 Entry。
        // 而一个Entry对象就有k，v EntrySet<K, V> 即：transient Set<Map.Entry<K, V>> entrySet
        // 3. entrySet中 定义的类型是 Map.Entry 但是实际上存放的还是 HashMap$Node
        // HashMap$Node implements Map.Entry<K, V>
        //

        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object entry : set) {
            System.out.println(entry.getClass());
            Map.Entry entry1 = (Map.Entry) entry;
            System.out.println(entry1.getKey() + "-" + ((Map.Entry<?, ?>) entry).getValue());

        }
        // 分别存在了：key-set  values-collection 然后key和values分别指向
        // map中的Node中的 key value
        Set set1 = map.keySet();
        Collection values = map.values();

    }
}

class Car {
    public Car() {
    }
}

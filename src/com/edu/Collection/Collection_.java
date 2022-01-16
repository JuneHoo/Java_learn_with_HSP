package com.edu.Collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        // 单列集合
        arrayList.add("jack");
        arrayList.add("tom");

        // 双列集合
        HashMap hashMap = new HashMap();
        hashMap.put("NO1", "Peking");
        hashMap.put("NO2", "ShangHai");

        System.out.println(hashMap);
    }
}

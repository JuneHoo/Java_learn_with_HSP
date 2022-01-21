package com.edu.arrays_;

import java.util.Arrays;
import java.util.List;

public class Method02 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 90, 123, 567};
        int index = Arrays.binarySearch(arr, 1);
        System.out.println(index);

        // 不存在 返回-1。源码中：
        // 如果不存在该元素 就返回 -(low + 1)
        System.out.println(Arrays.binarySearch(arr, -123));

        Integer[] newArr = Arrays.copyOf(arr, arr.length + 1);
        System.out.println(Arrays.toString(newArr));

        Integer[] num = new Integer[]{9, 2, 3};
        Arrays.fill(num, 99);
        System.out.println("使用99填充num数组后");
        System.out.println(Arrays.toString(num));

        Integer[] arr2 = {1, 2, 90, 123, 567};
        boolean equals = Arrays.equals(arr, arr2);
        System.out.println("equals = " + equals);

        List<Integer> asList = Arrays.asList(2, 3, 4, 4, 5, 7);
        System.out.println("asList = " + asList);
        System.out.println("asList = " + asList.getClass());
    }
}

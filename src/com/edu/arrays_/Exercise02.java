package com.edu.arrays_;

public class Exercise02 {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(reverse(str, 1, 4));
        System.out.println(reverse(str, 0, 3));
//        System.out.println(reverse(str, 0, 9));
        System.out.println(reverse(str, 4, 4));

    }

    public static String reverse(String str, int start, int end) {
        // 对输入的参数做一个验证
        // (1) 写出正确的情况
        // (2) 然后取反即可
        if (!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("Parameter start and/or error");
        }



        char[] chars = str.toCharArray();
        char temp;
        while (start < end) {
            temp = chars[end];
            chars[end] = chars[start];
            chars[start] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}

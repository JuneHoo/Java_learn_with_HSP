package com.edu.String_;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String str1 = "johN";
        String str2 = "john";
        System.out.println(str1.equals(str2));
        System.out.println("john".equalsIgnoreCase("johN"));
        System.out.println(str1.toUpperCase());
        String s1 = "宝玉";
        s1 = s1.concat("利纳迪").concat("John").concat("together");
        System.out.println(s1);
        // s1.replace() 方法执行后 返回的结果才是替换过的
        s1 = s1.replace("John", "123");

        System.out.println(s1);
    }
}

package com.edu.Wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        Integer i = 100;
        // way1
        String str1 = i + "";
        // way2
        String str2 = i.toString();
        System.out.println(str2);
        // way3
        String str3 = String.valueOf(i);
        // way4
        String str4 = "12345";
        String str5 = "12345";
        String str6 = new String("12345");
        Integer i2 = Integer.parseInt(str4);
        // way5
        Integer i3 = new Integer(str4);
        System.out.println("ok");

        System.out.println(str6 == str5);
        System.out.println(str6.equals(str5));

        //
        System.out.println("面试题：：：");

        Integer j1 = new Integer(1);
        Integer j2 = new Integer(1);
        System.out.println(j1 == (j2));

        // 如果数字范围在 -128~127：就是直接返回数字
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);

        // 否则 就new Integer(xx)
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == (y));

        System.out.println("只要有基本数据类型 就是判断值是否相等");
        int m1 = 127;
        Integer m2 = 127;
        System.out.println(m1 == m2);
        int n1 = 128;
        Integer n2 = 128;
        System.out.println(n1 == n2);

        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5 == i6);

        Integer i7 = 128; // 调用valueOf的底层是 return new Integer(128)
        Integer i8 = 128;
        System.out.println(i7 == i8);

        Integer i9 = 127;
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);
    }
}

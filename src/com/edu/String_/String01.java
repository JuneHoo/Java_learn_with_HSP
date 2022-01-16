package com.edu.String_;

public class String01 {
    public static void main(String[] args) {
        // jack 是字符串常量
        // String类有很多构造器：
        // String(byte[] b) String(char[] a, int startIndex, int count)
        // String 实现了接口 Serializable：可以串行化（在网络传输）
        // String 是final类 不能被其他类继承！
        // String 有属性private final char value[] 用于存放字符串内容
        // value是final的 指的是地址不可修改 并不是内容！！
        String name = "jack";
        name = "tom";
        final char[] value = {'a', 'b', 'c'};
        char[] v2 = {'t', 'o', 'm'};
        value[0] = 'H';
//        value = v2; // error

        String a = "abc";
        String b = "abc";
        System.out.println(a.equals(b));
        System.out.println(a == b);
    }
}

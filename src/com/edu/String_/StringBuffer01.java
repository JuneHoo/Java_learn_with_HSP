package com.edu.String_;

public class StringBuffer01 {
    public static void main(String[] args) {
        // StringBuilder的直接父类 是 AbstractStringBuilder
        // 在父类中 AbstractStringBuilder 有属性 char[] value, 不是final、
        // 该value 数组存放 字符串内容， 存放在堆中
        // StringBuilder是一个 final 类，不能被继承
        StringBuffer stringBuffer = new StringBuffer();
        // String保存的是字符串常量 里面的值不能更改!
        // 每次String类的更新实际上就是更改地址，效率较低（private final char value[]）
        // StringBuffer保存的是字符串变量 里面的值可以更改，每次
        // StringBuffer的更新实际上可以更新内容 不用每次更新地址 效率更高




    }
}

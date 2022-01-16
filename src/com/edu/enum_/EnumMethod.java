package com.edu.enum_;

import java.awt.font.NumericShaper;

public class EnumMethod {
    public static void main(String[] args) {
        // 使用Season2 枚举类
        // Enum中已经写过了 返回的是当前对象名 子类（Season）可以重写toString
        // 调用toString时候 现在当前类中找 Season中没找到 则调用Enum中的toString！！！
        Season02 spring = Season02.SPRING;
        Season02 summer = Season02.SUMMER;
        // 输出枚举对象的名字 .name()
        System.out.println(spring.name());
        // ordinal() 输出的是该枚举对象的次序
        System.out.println(spring.ordinal());
        System.out.println(summer.ordinal());

        // 含有所有定义的枚举对象
        Season02[] values = Season02.values();
        for (Season02 season02 : values) {
            System.out.println(season02);
        }

        int[] names = {1, 2, 9};
        System.out.println("=================");
        for (int i : names) {
            System.out.println(i);
        }
        System.out.println("======================");

        Season02 summer1 = Season02.valueOf("SUMMER");
        System.out.println("summer = " + summer1);
        System.out.println(summer == summer1); // true
        System.out.println(Season02.SUMMER.compareTo(summer)); // 0(相同)  其他数(不相同)
        //  return self.ordinal - other.ordinal;
    }
}

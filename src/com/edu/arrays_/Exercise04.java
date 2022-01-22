package com.edu.arrays_;

import java.util.Locale;

public class Exercise04 {
    // 姓名输出
    public static void main(String[] args) {
        String name = "Willian Jefferson Clinton";
        printName(name);
    }


    public static void printName(String str) {
        if (str == null) {
            System.out.println("str 不能为空");
            return;
        }

        String[] names = str.split(" ");
        if (names.length != 3) {
            System.out.println("Wrong input format");
        }

        String format = String.format("%s, %s .%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}



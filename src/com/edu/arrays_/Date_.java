package com.edu.arrays_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_ {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println("当前日期是：" + d1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println("当前日期是：" + format);
        Date d2 = new Date(9234567);
        System.out.println("d2 = " + d2);

        String s = "1915年01月02日 07:28:57 星期五";
        Date parse = sdf.parse(s);
        System.out.println(parse);
    }
}

class Dog {
    private String name;
    private int age;
    public void cry() {

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    class Air {
    }

    public void setSalary(int salary) {

    }

}

package com.edu.enum_;

import javax.swing.*;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season02.SPRING.getDesc());
//        System.out.println(Season02.SPRING.getDesc());
    }
}

// 演示自定义枚举实现
enum Season02 {

    // 注意：如果使用enum来实现枚举 必须将定义常量对象 写在最前面
    SPRING("Spring","warm"), SUMMER("Summer", "hot"), WINTER("Winter", "cold");

    private String name;
    private String desc;

    public String getName() {
        return name;
    }

    //    public static final Season02 SPRING = new Season02("Spring", "warm");
//    public static Season02 WINTER = new Season02("Winter", "cold");
//    public static Season02 AUTUMN = new Season02("Autumn", "cool");
//    public static Season02 SUMMER = new Season02("Summer", "hot");

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDesc() {
        return desc;
    }

//    public void setDesc(String desc) {
//        this.desc = desc;
//    }

    // 构造器私有化 防止直接new画出来
    // 去掉set 防止属性被修改
    // 在Season内部 直接创建固定的对象
    private Season02(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

}

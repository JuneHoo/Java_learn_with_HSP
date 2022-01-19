package com.edu.reflection_;

import java.sql.SQLOutput;

public class Class01 {
    // Class也是类 也继承了Object
//    Class 类是系统创建的 不是new出来的
    public static void main(String[] args) throws ClassNotFoundException {
        Cat cat = new Cat();

        // 2.
//            try {
                Class aCLass = Class.forName("com.edu.reflection_.Cat");
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
        // 3. 无法重复加载 HashCode一样
//            try {
                Class aCLass2 = Class.forName("com.edu.reflection_.Cat");
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
        System.out.println(aCLass.hashCode());
        System.out.println(aCLass2.hashCode());

        // 4.可以通过Class对象 得到整个类的细节
    }



}

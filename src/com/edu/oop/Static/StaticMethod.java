package com.edu.oop.Static;

// 开发自己的工具类时候 可以把方法写成静态的 方便调用

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("Tom");
//        tom.payFee(100);
        Stu.payFee(100);
        Stu mary = new Stu("Mary");
        tom.payFee(200);

        Stu.showFee();
    }
}

class Stu {
    public Stu(String name) {
        this.name = name;
    }

    private String name;
    private static double fee = 0;

    public static void payFee(double fee) {
        Stu.fee += fee;
    }
    
    public static void showFee() {
        System.out.println("The total fee is: " + Stu.fee);
        System.out.println(Math.sqrt(9));
    }
}

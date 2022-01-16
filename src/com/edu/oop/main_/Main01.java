package com.edu.oop.main_;

import sun.applet.Main;

public class Main01 {
    private static String name = "Edu";

    private int n1 = 10000;
    public static void hi() {
        System.out.println("The hi method in Main01");
    }

    public static void main(String[] args) {

        System.out.println("name=" + name);

        hi();
        // static method main cannot use the non-static value

        Main01 main01 = new Main01();
        System.out.println(main01.n1); // In this way we can use non-static value n1
    }
    public void cry() {
        System.out.println("The cry method in Main01");
    }

}

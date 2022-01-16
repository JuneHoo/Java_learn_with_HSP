package com.edu.houserent.utils;

public class TestUtilities {
    public static void main(String[] args) {
        // readString is an API
        String s = Utility.readString(3);
        System.out.println("s=" + s);

        // directly use class.method: because this method is static method which can use
        String s2 = Utility.readString(10, "dasdhhjkas");
        System.out.println("s2=" + s2);
//        A.cry();
//        A.hi();
    }
}


//class A {
//    public void hi() {
//
//    }
//    public static void cry() {
//
//    }
//}

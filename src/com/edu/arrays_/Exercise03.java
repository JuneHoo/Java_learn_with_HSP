package com.edu.arrays_;

import javax.management.RuntimeOperationsException;

public class Exercise03 {
    public static void main(String[] args) {
        String name = "asd";
        String pwd = "123456";
        String emial = "jack@gamail.com";

        userRegister(name, pwd, emial);
        System.out.println("注册成功！");
    }

    public static void userRegister(String name, String password, String email) {
        if (!(name.length() == 2 || name.length() == 3 || name.length() == 4)) {
            throw new RuntimeException("用户名长度为2或3或4");
        }
        if (!(password.length() >= 6 && isDigit(password))) {
            throw new RuntimeException("密码的长度为6 要求全是数字！");
        }

        int i = email.indexOf("@");
        int j = email.indexOf(".");
//        int i = email.indexOf("@");
        if (!((i > 0) && j > i)) {
            throw new RuntimeException("Email format error");
        }

    }

    public static boolean isDigit(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}

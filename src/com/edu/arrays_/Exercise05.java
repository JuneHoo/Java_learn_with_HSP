package com.edu.arrays_;

public class Exercise05 {
    public static void main(String[] args) {
        String str = "HKsadkjhKJ";
        countStr(str);
    }

    //    遍历字符串
    public static void countStr(String str) {
        if (str == null) {
            System.out.println("输入不能为空");
            return;
        }
        int numCount = 0;
        int lowerCount = 0;
        int UpperCount = 0;
        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numCount ++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCount++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                UpperCount++;
            } else {
                otherCount++;
            }
            numCount++;
        }
        System.out.println("共" + numCount + "个字符" + " 大写字符" + UpperCount + "个"+" 小写字符" + lowerCount + "个" + " 其他字符" + otherCount + "个");
    }

}

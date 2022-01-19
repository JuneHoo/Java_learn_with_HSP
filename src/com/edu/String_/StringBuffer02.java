package com.edu.String_;

//import com.sun.javafx.binding.StringFormatter;

public class StringBuffer02 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        // 1 创建一个大小为16的char[]的 用于存放字符内容

        // 2 通过构造器指定char[] 大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

        String str = "hello tom";
        // 返回的才是StringBuffer对象 对str本身没影响
        StringBuffer stringBuffer2 = new StringBuffer(str);

        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3 = stringBuffer3.append(str);
        // StringBuffer -> String
        String s = stringBuffer3.toString();
        System.out.println(s);
    }
}

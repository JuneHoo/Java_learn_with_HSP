package com.edu.String_;

public class StringCharacter {
    String str = new String("hsp"); // "hsp"在常量池中 str在堆中 指向value(堆中) value指向hsp(常量池)
    final char[] ch = {'j', 'a', 'v', 'a'}; // 数组存放在堆中

    public static void main(String[] args) {

        StringCharacter stringCharacter = new StringCharacter();
        stringCharacter.change(stringCharacter.str, stringCharacter.ch);
        System.out.println(stringCharacter.str + " and ");
        System.out.println(stringCharacter.ch);
    }

    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
        System.out.println(str);
    }
}

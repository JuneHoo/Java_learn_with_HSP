package com.edu.String_;

public class StringExercise3 {
    public static void main(String[] args) {
        String a = "hsp"; // a指向常量池的“hsp”
        String b = new String("hsp"); // b指向堆中对象
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a == b.intern());
        System.out.println(b == b.intern());
        System.out.println();
        // 当调用intern方法时 如果池已经包含一个等于此String对象的字符串（用equals方法确定）
        // 则返回 池中的 字符串。 否则 将此String对象添加到池中 并返回此String对象引用
        // b.intern()返回的是常量池的地址（对象）

        String aa = "hello" + "abc";
        // 创建了几个对象？只有一个对象
        // 会优化 等价为：String a = "helloabc"
        String bb = "abc";
        String c = aa + bb; //
        // 创建了 3 个对象
        // 先创建一个StringBuilder sb = StringBuilder()
        //        执行 sb.append("hello"); sb.append("abc");
        // String c = sb.toString()
        // 最后其实是c指向堆中的对象(String) value[] -> 池中 “helloabc”
        String d = "helloabc";
        System.out.println(c==d); // false 因为d直接指向 池子中 “helloabc”
        // c 指向堆中对象 对象指向池中 “helloabc”

        String e = "hello" + "abc"; // 字符串相加 直接看 池子
        System.out.println(d == e); // true
    }
}

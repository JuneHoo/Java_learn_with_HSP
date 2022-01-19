package com.edu.String_;

public class StringBuilder01 {
    public static void main(String[] args) {
        // StringBuilder 不是线程安全的 该类被设计为StringBuffer的简单替换
        // 用在字符串缓冲区被单个线程使用的时候。优先使用 StringBuilder
        StringBuilder builder = new StringBuilder();
        // extends AbstractStringBuilder implements Serializable interface
        // StringBuilder对象可以串行化（对象可以网络传输 可以保存到文件）
        // 是final类 不能被继承。StringBuilder对象字符序列仍然是存放在其父类
        // 的char value[]中，因此 字符序列是在堆中
        // StringBuilder的方法，没有做互斥处理，即没有synchronized修饰


        // 如果字符串存在大量修改操作 一般使用StringBuffer或 StringBuilder
        // 如果字符串存在大量修改操作 单线程情况使用 StringBuilder
        // 如果字符串存在大量修改操作 多线程情况使用 StringBuffer
        // 如果字符串很少修改 并被多个对象引用 使用String 比如：配置信息等

    }
}

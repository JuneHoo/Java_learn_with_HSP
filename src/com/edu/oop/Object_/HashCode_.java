package com.edu.oop.Object_;

public class HashCode_ {
    public static void main(String[] args) {
        // 提高具有hash结构的容器的效率
        /*
        两个引用 如果指向的是同一个对象 则hash value肯定是一样的
        两个引用 如果指向的是不同的对象 则hash value肯定不一样
        哈希值主要根据地址号来的 不能完全将哈希值等价于地址！！！
        在集合中 如果需要的话 HashCode也会重写
         */
        AA aa = new AA();
        AA aa2 = new AA();
        AA aa3 = aa;
        System.out.println("aa.hashCode() = " + aa.hashCode());
        System.out.println("aa2.hashCode() = " + aa2.hashCode());
        System.out.println("aa3.hashCode() = " + aa3.hashCode());

    }
}


class AA {

}
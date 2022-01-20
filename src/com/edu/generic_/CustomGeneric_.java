package com.edu.generic_;

public class CustomGeneric_ {
    public static void main(String[] args) {
        Tiger02<Double, String, Integer> g = new Tiger02<>("john");
        g.setT(9.0);
        g.setM(123);
        g.setR("Millan");
        System.out.println(g);
        Tiger02 tiger = new Tiger02("John"); // 默认泛型TRM为Object类型
        tiger.setT("Millan");
        System.out.println(tiger);
    }
}


// 自定义泛型
// Tiger后面泛型 所以我们把 Tiger 成为自定义泛型类
// TRM 泛型的标识符 一般是单个大写字母
// 反省标识符可以有多个
// 普通成员可以使用泛型(属性、方法)
// 使用泛型的数组 不能初始化

class Tiger02<T, R, M> {
    String name;
    R r;
    T t;
    M m;
    T[] ts; // 不能初始化
    R r2;

    public Tiger02(String name) {
        this.name = name;
    }

    public Tiger02(R r, T t, R r2) {
        this.r = r;
        this.t = t;
        this.r2 = r2;
    }

    //    public static void m1(M m) {
//
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public Tiger02(String name, R r, T t, M m) {
        this.name = name;
        this.r = r;
        this.t = t;
        this.m = m;
//        this.ts = ts;
    }

    public void setR(R r) {
        this.r = r;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}

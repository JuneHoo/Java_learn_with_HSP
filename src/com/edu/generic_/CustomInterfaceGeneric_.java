package com.edu.generic_;

import java.util.zip.DeflaterOutputStream;

public class CustomInterfaceGeneric_ {
    public static void main(String[] args) {

    }
}

// 实现接口时 直接指定泛型接口类型
// 给U 指定Integer
class BB implements IUsb<Integer, Float> {

    @Override
    public Float get(Integer c) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}
// 自定义泛型接口 其类型在继承或实现时确定
// 接口 继承接口时候指定泛型接口的类型
interface IUsb<U, R> {
    int n = 10;
    R get(U c);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

}

interface IA extends IUsb<String, Double> {

}

class AA implements IA {

    @Override
    public Double get(String c) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}
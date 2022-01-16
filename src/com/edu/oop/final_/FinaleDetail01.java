package com.edu.oop.final_;

public class FinaleDetail01 {
    public static void main(String[] args) {
        EE ee = new EE();
        ee.cal();

    }
}

class AA {
    public final double TAX_RATE = 0.08;
//    public final double TAX_RATE2;  常量必须赋初始值
    public final double TAX_RATE3;
    public final double TAX_RATE4;
    public AA() {
        TAX_RATE3 = 1.1;
    }
    {
        TAX_RATE4 = 8.8;
    }

}

class BB {
    public static final double TAX_RATE = 99.9;
    public static final double TAX_RATE2;
//    public static final double TAX_RATE3;
    static {
        TAX_RATE2 = 99.99;
    }

//    public BB() {
//        TAX_RATE3 = 88.8;
//    }
}

final class CC {
    // final类不能被继承 但可以实例化
}

class DD {
    public void cal() {
        System.out.println("cal()方法");
    }

}

class EE extends DD {
    // final方法不能被重写 但是可以被继承

}
package com.edu.oop;

import com.sun.xml.internal.bind.v2.runtime.NamespaceContext2;
import javafx.scene.control.Cell;

public class HW04 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        // 匿名内部类是
        // new Calculator() {
        //            @Override
        //            public double calculate(double n1, double n2) {
        //                return n1 + n2;
        //            }
        //        } 同时也是一个对象

        cellPhone.testWork(new Calculator() {
            @Override
            public double calculate(double n1, double n2) {
                return n1 + n2;
            }
        }, 10, 8);


        cellPhone.testWork(new Calculator() {
            @Override
            public double calculate(double n1, double n2) {
                return n1 * n2;
            }
        }, 11, 22);

    }
}

interface Calculator {
    // 至于怎样计算 使用匿名内部类完成
    public double calculate(double n1, double n2);

}

class CellPhone {

    // 当调用testWork方法时 直接传入一个实现了Calculator接口的匿名内部类即可
    // 可以
    public void testWork(Calculator calculator, double n1, double n2) {

        double result = calculator.calculate(n1, n2); // 动态绑定
        System.out.println("计算后的结果是：" + result);
    }
}


package com.edu.SmallChangeMoney;
public class Exercise15 {
    public static void main(String[] args) {
        AAA obj = new BBB();
        AAA b1 = obj;
        // 编译类型（AAA)不会变 运行类型可以变！

        System.out.println("obj's run-time type is:" + obj.getClass());

        obj = new CCC();

        System.out.println("obj's run-time type is:" + obj.getClass());
        obj = b1;
        System.out.println("obj's run-time type is:" + obj.getClass());

    }
}

class AAA {

}

class BBB extends AAA {
}


class CCC extends BBB {

}
package com.edu.oop;

public class HW02 {

}


class Frock {
    public Frock() {
        serialNumber = getNextNum();
    }

    // 静态属性是所有对象共享的
    private static int currentNum = 100000;
    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;

    }
}

class TestFrock {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println("=======================");
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());

    }
//    new Frock()

}
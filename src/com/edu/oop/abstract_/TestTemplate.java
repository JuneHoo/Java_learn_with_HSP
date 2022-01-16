package com.edu.oop.abstract_;

public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calculate();
    }
}


class AA extends Template{
    @Override
    public void job() {
        long num = 0;
        for (long i = 1; i <= 1000000; i++) {
            num += i;
        }
    }
}

abstract class Template {

    public abstract void job();
    public void calculate() {
        long start = System.currentTimeMillis();

        job();
        long end = System.currentTimeMillis();
        System.out.println("The cost time is: " + (end - start));

    }
}
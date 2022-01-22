package com.edu.arrays_;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        long l = 123213123213123l;
        System.out.println(l);
        // 比long还长的 是 BigInteger
        BigInteger bigInteger = new BigInteger("1232187368712632836");
        System.out.println(bigInteger);
        BigInteger add = bigInteger.add(new BigInteger("100"));
        System.out.println(add);

        BigInteger subtract = bigInteger.subtract(add);
        System.out.println(subtract);
    }
}

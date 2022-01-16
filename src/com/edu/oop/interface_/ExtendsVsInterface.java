package com.edu.oop.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("Tom");
        littleMonkey.climbing();
        littleMonkey.swimming();

    }
}

class Monkey {
    private String name;

    public void climbing() {
        System.out.println(name + " can climb");

    }

    public Monkey(String name) {
        this.name = name;
    }
}

interface Fishable {
    void swimming();
}
class LittleMonkey extends Monkey implements Fishable {
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println("It can swim~");
    }
}
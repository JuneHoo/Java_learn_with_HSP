package com.edu.oop.Static;

public class ChildGame {

    public static void main(String[] args) {
        int count = 0;

        Child child1 = new Child("Jake");
        Child child2 = new Child("Mike");
        Child child3 = new Child("Tom");
        child1.join();
        child1.count++;
        child2.join();
        child2.count++;
        child3.join();
        child3.count++;

        System.out.println("共有" + Child.count + "个小孩子join");
    }
}

class Child {
    private String name;
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }
    public void join() {
        System.out.println(name + " 加入了游戏");
    }

}
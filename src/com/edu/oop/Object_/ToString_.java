package com.edu.oop.Object_;

public class ToString_ {
    public static void main(String[] args) {
                /*
                ToString源代码：
           public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }
            Integer.toHexString：将对象的hashCode值转成16进制字符串
                 */
        Monster monster = new Monster("小妖怪", "巡山的", 1000);
        System.out.println(monster.toString() + " hashcode=" + monster.hashCode());
        System.out.println("当直接输出一个对象时 toString方法会被默认的调用");
        System.out.println(monster);
    }
}

class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }
    // 经常会重写toString方法 来输出对象的属性
    // 当直接输出一个对象时 toString方法会被默认的调用

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}


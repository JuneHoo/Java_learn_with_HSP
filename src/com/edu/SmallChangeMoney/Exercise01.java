package com.edu.SmallChangeMoney;

public class Exercise01 {
    public static void main(String[] args) {
        // 向上转型：父类的引用指向子类对象（编译看左边 运行看右边）
        Person p = new Student();
        p.run();
        p.eat();
        // 向下转型：把指向子类对象的父类引用 转化成指向子类对象的子类引用
        // 这样就能在编译时候（看左边）调用子类的方法
        Student s = (Student) p;
        s.run();
        s.study();
        s.eat(); // 继承的父类的方法！
    }
}

class Person {
    public void run() {
        System.out.println("person run");

    }

    public void eat() {
        System.out.println("person eat");
    }

}

class Student extends Person {
    public Student() {
    }

    private String name;
    private char gender;
    private String stu_id;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, char gender, String stu_id, int age) {
        this.name = name;
        this.gender = gender;
        this.stu_id = stu_id;
        this.age = age;
    }

    public void eat() {
        System.out.println("student eat");
    }
    public void study() {
        System.out.println("student study");
    }
}

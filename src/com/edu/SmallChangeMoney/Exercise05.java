package com.edu.SmallChangeMoney;

public class Exercise05 {
    public static void main(String[] args) {
        Student05 student = new Student05("Mike", 'M', 12, "000123321");
        student.printInfo();
    }
}

class Person05 {
    private String name;
    private char gender;
//    private String stu_id;
    private int age;

    public String play() {
        // important
        return name + " like play";
    }

    public String basicInfo() {
        return "Name: " + name + "\nage:" + age + "\ngender" + gender;
    }


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person05(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}

class Student05 extends Person05 {
    private String stu_id;

    public Student05(String name, char gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println("I promise I'll get A");
    }

    @Override
    public String play() {
        return super.play() + " football!";
    }

    public void printInfo() {
        System.out.println("Student's info:");
        System.out.println(super.basicInfo());
        System.out.println("Studnet_ID: " + stu_id);
        study(); // OOP 变化万千
        System.out.println(play());
    }


}

class Teacher05 extends Person05 {
    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    private int work_age;

    public Teacher05(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("I will give you A");
    }
}
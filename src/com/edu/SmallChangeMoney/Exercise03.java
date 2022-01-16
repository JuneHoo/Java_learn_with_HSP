package com.edu.SmallChangeMoney;

public class Exercise03 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jia", 30, "AP", 30000, 1.2);
        professor.introduce();
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double base;
    // Add a salary level
    private double level;

    public Teacher(String name, int age, String post, double base, double level, char gender, int work_age) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.base = base;
        this.level = level;
        this.gender = gender;
        this.work_age = work_age;
    }

    private char gender;
    private int work_age;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void introduce() {
        System.out.println("name: " + name + " age: " + age + " post: " + post + " baseSalary: " + base + " level: " + level);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public Teacher(String name, int age, String post, double base, double level) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.base = base;
        this.level = level;
    }
}

class Professor extends Teacher {


    public Professor(String name, int age, String post, double base, double level) {
        super(name, age, post, base, level);
    }

    @Override
    public void introduce() {
        System.out.println("This is a professor");
        super.introduce();
    }
}
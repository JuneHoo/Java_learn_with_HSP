package com.edu.oop.main_;

public class CodeBlock {

    public static void main(String[] args) {
        Movie movie1 = new Movie("About Time");
    }
}

class Movie {
    String name;
    private double price;
    private String director;

    // 当我们不管调用哪个构造器创建对象 都会先调用代码块的content
    {
        System.out.println("Movie screen start...");
        System.out.println("Advs start...");
        System.out.println("Movie start...");
    }
    public Movie(String name, double price) {
        System.out.println("Movie(String name, double price)被调用");
        this.name = name;
        this.price = price;
    }

    public Movie() {
    }

    public Movie(String name) {
        this.name = name;
        System.out.println("Movie(String name)被调用");
    }
}

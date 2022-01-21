package com.edu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class Exercise01 {
    public static void main(String[] args) {
        Book[] books = new Book[]{new Book("Java", 111.23), new Book("Python", 111.11), new Book("PHP", 70.99)};
        // 按照价格从大到小排序 后边 减去 前边
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double compare = o2.getPrice() - o1.getPrice();
                return (int) compare;
            }
        });
        System.out.println(Arrays.toString(books));


        // 按照书名的长度排序
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double compare = o1.getName().length() - o2.getName().length();
                return (int) compare;
            }
        });
        System.out.println(Arrays.toString(books));
    }
}

class Book {
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

//    public void sort(Book[], Comparator comparator) {
//        comparator
//    }
}

package com.edu.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 123.45));
        col.add(new Book("红楼梦", "曹雪芹", 223.12));
        col.add(new Book("西游记", "罗贯中", 244.111));

        System.out.println("col=" + col);
        // 遍历集合
        // 1，先得到对应的迭代器
        Iterator iterator = col.iterator();
        // 2. 使用while循环遍历
//        while (iterator.hasNext()) {
//            // 返回下一个元素 类型是Object
//            Object obj = iterator.next(); // 编译类型是Obj 运行类型取决于真正存放的类型
//            System.out.println(obj);
//            Object next = iterator.next();
//        }
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("obj=" + next);
        }
        System.out.println();
        // 3.当迭代器退出while循环后，这时iterator迭代器，指向最后的元素
        // iterator.next();
        // 4.如果希望再次迭代 需要重置我们得迭代器
        iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("new iterator: " + next);
        }



    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}

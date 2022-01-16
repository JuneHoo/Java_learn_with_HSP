package com.edu.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 123.45));
        col.add(new Book("红楼梦", "曹雪芹", 223.12));
        col.add(new Book("西游记", "罗贯中", 244.111));

        // 增强for循环
        for (Object book : col) {
            System.out.println("book = " + book);
        }
    }
}

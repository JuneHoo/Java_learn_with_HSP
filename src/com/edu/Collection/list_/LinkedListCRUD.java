package com.edu.Collection.list_;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

@SuppressWarnings({"all"})
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(1);
        System.out.println(list);
        list.remove(1);

        list.add(213);
        list.set(1, 999);
        System.out.println(list);

        System.out.println(list.indexOf(999));

        // get(1) is helping get the second obj in the list
        Object o = list.get(1);
        System.out.println(o);


        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next= " + next);
        }
        System.out.println("list's reforce for");
        for (Object o1 : list) {
            System.out.println("o1= " + o1);
        }


    }

}

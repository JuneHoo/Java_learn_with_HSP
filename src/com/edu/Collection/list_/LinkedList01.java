package com.edu.Collection.list_;

public class LinkedList01 {
    public static void main(String[] args) {
        // 模拟一个简单的双向链表

        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node jake = new Node("jake");

        jack.next = tom;
        tom.next = jake;
        jake.pre = tom;
        tom.pre = jack;

        Node first = jack;
        Node last = jake;
        // scan from head to tail
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        // from tail to head
        System.out.println("====================================");
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
        // 链表的添加对象/数据 很方便
        // 1. insert smith into the list
        Node smith = new Node("Smith");
        smith.pre = tom;
        smith.next = jake;
        jake.pre = smith;
        tom.next = smith;
        // initialize first node
        first = jack;
        System.out.println("======================================");
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }


    }
}

class Node {
    public Object item; // data
    public Node next; // the next node
    public Node pre; // the previous node

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}

package com.edu.Collection.set_;

public class HashSetStructure {
    public static void main(String[] args) {
        // 模拟一个HashSet的底层 （HashMap 的底层结构）HashSet底层就是HashMap
        Node[] table = new Node[16];
        System.out.println("table =" + table);
        // 创建结点
        Node john = new Node("john", null);
        System.out.println("table = " + table);

        table[2] = john;

        Node jack = new Node("jack", null);
        john.next = jack; // 将jack挂载到john
        System.out.println("table = " + table);
        Node rose = new Node("rose", null);
        jack.next = rose;
        System.out.println("table = " + table);

        Node lucy = new Node("lucy", null);
        table[3] = lucy;
        System.out.println("table = " + table);




    }
}


class Node { // 结点 存储数据 可以指向下一个结点 形成链表
    Object item;
    Node next;

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }


}
package com.edu.Collection.set_;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Message> received = new ArrayList<>();
        received.add(new Message(1, "Hello!"));
        received.add(new Message(2, "发工资了吗？"));
        received.add(new Message(2, "发工资了吗？"));
        received.add(new Message(3, "去哪吃饭？"));
        received.add(new Message(3, "去哪吃饭？"));
        received.add(new Message(4, "Bye!"));
        List<Message> displayMessages = process(received);
        for (Message message : displayMessages) {
            System.out.println(message.text);
        }
    }

    static List<Message> process(List<Message> received) {
        // TODO: 按sequence去除重复消息
        // 为何不行？？？
//        Set set = new TreeSet();
//        List<Message> l = new ArrayList<>();
//        for(Message m:received){
//            set.add(m);
//        }
//        for(Object m:set){
//            l.add((Message) m);
//        }
//        return l;

        Set<Integer> set = new HashSet<>();
        List<Message> r = new ArrayList<>();
        for(Message l : received){
            if(set.add(l.sequence)){
                r.add(l);
            }
        }
        return r;

    }
}

class Message {
    public final int sequence;
    public final String text;
    public int compareTo(Message m){
        if(this.sequence==m.sequence){
            return 0;
        }
        return this.sequence>m.sequence ? 1 : -1;
    }

    public Message(int sequence, String text) {
        this.sequence = sequence;
        this.text = text;
    }
}

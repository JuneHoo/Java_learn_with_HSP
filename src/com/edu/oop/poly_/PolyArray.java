package com.edu.oop.poly_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jack", 19, 100);
        persons[2] = new Student("smith", 20, 90);
        persons[3] = new Teacher("Scott", 33, 10000);
        persons[4] = new Teacher("Jay", 66, 30000);
        // 遍历多态数组 调用say
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());

            if (persons[i] instanceof Student) {
                // 判断运行类型是不是Student
                ((Student)persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            } else {
                System.out.println("Your run-time type is in error");
            }
//            persons[i].study();
        }
    }
}

package com.edu.generic_;

import java.util.ArrayList;
import java.util.List;

public class GenericDetails {
    public static void main(String[] args) {
        // 1.给泛型指向数据类型时 要求是引用类型 不能是基本数据类型
        List<Integer> list = new ArrayList<Integer>(); // OK
//        List<int> list1 = new ArrayList<int>(); // Type argument cannot be of primitive type

        // 因为 E 指定了 A类型，构造器传入了 new A()
        // 2.在给泛型指定具体类型后 可以传入该类型或者其子类类型
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<A> aPig1 = new Pig<A>(new B());
        aPig1.f();

        // 3.泛型的使用形式
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        // 实际开发中 往往简写
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();

        // 左边不可省略 右边可以省略~
        ArrayList<Pig> pigs = new ArrayList<>();

        // 4.泛型默认是Object
        List list5 = new ArrayList();

//        默认是这么写的：ArrayList<Object> arrayList = new ArrayList<>();
        Tiger tiger = new Tiger();
        /* 相当于
        class Tiger<E> {
            Object e;

            public Tiger() {
            }

            public Tiger(Object e) {
                this.e = e;
            }
}

         */

    }
}


class A {

}

class Tiger<E> {
    E e;

    public Tiger() {
    }

    public Tiger(E e) {
        this.e = e;
    }
}
class B extends A{

}

class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f() {
        System.out.println(e.getClass()); // 获取e的运行类型
    }
}
package com.edu.oop.main_;

// 静态代码块只执行一次 普通代码块 每次创建对象 都会执行一次
public class CodeBlockDetails {
    public static void main(String[] args) {
        // Class's instance was created
        AA aa = new AA();

        // 创建子类对象实例 父类也会被加载，而且父类先被加载 子类后被加载
        AA aa2 = new AA();
        System.out.println();

        // 使用类的静态成员时 会加载静态代码块
        System.out.println(Cat.n1);

        // static 代码块 是在类加载时 执行的 而且只会执行一次
        DD dd = new DD();
        DD dd1 = new DD();


    }
}

class DD {
    static {
        System.out.println("DD的静态代码1被执行。。。。");
    }
}
class Cat {
    public static int n1 = 999;
    static {
        System.out.println("Cat 的静态代码块被执行。。。。");
    }
}

class BB {
    static {
        System.out.println("BB的静态代码块执行。。。。");
    }


}
class AA extends BB{

    static {
        System.out.println("AA的静态代码块执行。。。。");
    }

}

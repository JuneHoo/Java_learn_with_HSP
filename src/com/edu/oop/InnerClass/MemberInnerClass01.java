package com.edu.oop.InnerClass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();

        // 使用成员内部类 创建一个对象
        Outer08.Inner08 inner08 = outer08.new Inner08();

        // 在外部类中编写一个方法 可以返回Inner08 对象
        Outer08.Inner08 inner081 = outer08.getInner08Instance();
        inner081.say();

        //
        Outer08.Inner08 inner082 = new Outer08().new Inner08();
        inner082.say();
    }
}

class Outer08 {
    private int n1 = 10;
    public String name = "张三";

    // 注意：成员内部类是定义在外部类的成员位置上 可以添加任何访问修饰符

    class Inner08 { // 成员内部类
        private double sal = 9.9;
        private int n1 = 66;

        public void say() {
            // 可以访问外部类的左右成员 包括私有的
            System.out.println("n1 = " + n1 + " name = " + name + " n1 in Outer08: " + Outer08.this.n1);
            hi();
        }

        private void hi() {
            System.out.println("hi");
        }
    }

    public Inner08 getInner08Instance() {
        return new Inner08();
    }

    public void t1() {
        Inner08 inner08 = new Inner08();
        inner08.say();

    }

}

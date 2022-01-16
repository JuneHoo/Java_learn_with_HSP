package com.edu.oop.InnerClass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        // 当作实参直接传递 简洁高效
        f1(new IL() { // 摒弃传统方式：写个类实现IL然后传递给f1其对象
            @Override
            public void show() {
                System.out.println("This is art");
            }
        });
    }

    // 静态方法
    public static void f1(IL il) {
        il.show();
    }
}

interface IL {
    void show();
}

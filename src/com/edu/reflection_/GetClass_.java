package com.edu.reflection_;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {
        String classAllPath = "com.edu.reflection_.Car";
        // 1.  Class.forName
        Class cls1 = Class.forName(classAllPath);
        System.out.println(cls1);
        // 2.类名.class 应用场景：参数传递
        Class<Car> cls2 = Car.class;
        System.out.println(Car.class);
        // 3.对象.getClass() 应用场景：有对象实例
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);

        // 4.通过类加载器（4种）获取到类的Class对象
        // (1) 先得到类加载器 car
        ClassLoader classLoader = car.getClass().getClassLoader();
        // (2) 通过类加载器得到Class对象
        Class cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());

        // 5.基本数据 按照如下方式得到Class类对象
        Class <Integer> integerClass = int.class;
        Class<Character> charClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);

        // 6.基本数据类型对应的包装类 可以通过.TYPE 得到Class类对象
        Class<Integer> type1 = Integer.TYPE;
        System.out.println(type1);

        System.out.println(type1.hashCode());
        System.out.println(integerClass.hashCode());

    }
}

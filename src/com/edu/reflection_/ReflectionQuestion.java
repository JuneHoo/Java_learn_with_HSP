package com.edu.reflection_;

import sun.plugin2.message.GetAppletMessage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\com\\edu\\reflection_\\re.properties"));
        String methodName = properties.get("method").toString();
        String classfullpath = properties.get("classfullpath").toString();
        System.out.println("method=" + methodName);
        System.out.println(classfullpath);

        // 通过反射机制 加载类，返回Class类型的对象cls
        Class cls = Class.forName(classfullpath);

        // 通过cls得到加载的类 的对象实例
        Object o = cls.newInstance();
        System.out.println("o的运行类型= " + o.getClass());
        // 通过cls得到加载的类com.edu.Cat的methodName "hi" 的方法对象
        // 即 在反射中 可以把方法是为对象（万物皆对象）
        Method method1 = cls.getMethod(methodName);
        // 通过method1调用方法：即通过方法对象来实现调用方法
        method1.invoke(o); // 反射机制：方法.invoke(对象)
        // typically it is object.method()
        System.out.println("======================");
        Field nameField = cls.getField("age");
        // 反射机制：成员变量.get（对象）！
        System.out.println("age : " + nameField.get(o));

        Constructor constructor = cls.getConstructor();
        System.out.println(constructor); // 返回无参构造器、

        // 获取有参构造器
        Constructor constructor1 = cls.getConstructor(String.class);
        System.out.println(constructor1);
    }
}

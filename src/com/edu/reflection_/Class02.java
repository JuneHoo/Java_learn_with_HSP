package com.edu.reflection_;

import java.lang.reflect.Field;

public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        // 先拿倒类的位置
        String classAllPath = "com.edu.reflection_.Car";

        Class cls = Class.forName(classAllPath);
        // 2.输出cls
        System.out.println(cls); // 显示cls对象，是那个类的Class对象
        System.out.println(cls.getClass()); // 输出cls运行类型 java.lang.Class
        // 3.得到包名
        System.out.println(cls.getPackage().getName());
        // 4.得到全类名
        System.out.println(cls.getName());
        // 5.通过cls创建对象实例
//        System.out.println();
        Car car = (Car) cls.newInstance();
        System.out.println(car.toString());
        // 6.通过反射取得属性（private取不到）
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));
        // 7.通过反射给属性赋值
        brand.set(car, "Benz");
        System.out.println(brand.get(car));
        // 8. 得到所有属性（字段）
        System.out.println("==========================");
        Field[] fields = cls.getFields();
        for (Field f : fields) {
            System.out.println(f.getName()); // 名称
        }
    }
}

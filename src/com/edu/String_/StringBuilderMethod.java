package com.edu.String_;

import javax.xml.bind.SchemaOutputResolver;

public class StringBuilderMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello");

        s.append(',');
        s.append("ZSF");
        s.append(true).append("赵敏").append(123);
        System.out.println(s);
        s.delete(0, 3);
        System.out.println(s);
        System.out.println(s.indexOf("赵敏"));
        s.insert(1, 123);
        System.out.println("=======================================");

        String s_new = null;
        s.append(s_new);
        System.out.println(s);
        StringBuffer sb = new StringBuffer(s_new); // 拿null会抛出异常
        System.out.println(sb);

    }
}

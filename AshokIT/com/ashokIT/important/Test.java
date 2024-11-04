package com.ashokIT.important;

import java.lang.reflect.Field;

public class Test {

    public static void main(String[] args) throws Exception {
        /**
         * Loophole in java private field of a class can be access using reflection Api which is against OOPS principle
         */
        Class<?> clz = Class.forName("com.ashokIT.important.Try");

        Object obj = clz.newInstance();

        Try t = (Try)obj;

        Field field = clz.getDeclaredField("num");
        field.setAccessible(true);
        field.set(t,60);
        System.out.println(t.show());

    }

}

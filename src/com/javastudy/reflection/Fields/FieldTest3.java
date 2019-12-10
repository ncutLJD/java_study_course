package com.javastudy.reflection.Fields;

import java.lang.reflect.Field;

/**
 * @program: java_study_course
 * @description:
 * @author: ljd
 * @create: 2019-12-10 11:37
 */
public class FieldTest3 {

    private final String name = "不是秃头的小李程序员";

    public static void main(String[] args) throws Exception {
        Object object = new FieldTest3();
        Class c = FieldTest3.class;
        Field field = c.getDeclaredField("name");
        Object value = field.get(object);
        System.out.println(value);
    }
}


//        Object animal = new Animal("不是秃头的小李程序员");
//        Class c = Animal.class;
//        Field field = c.getDeclaredField("name");
//        Object value = field.get(animal);
//        System.out.println(value);
//        Animal animal = new Animal();
//        animal.testFiled();


package com.javastudy.reflection.Fields;

import java.lang.reflect.Field;

/**
 * @program: java_study_course
 * @description:
 * @author: ljd
 * @create: 2019-12-10 11:53
 */
public class FieldTest4 {

    public static void main(String[] args) throws Exception {
//        Object animal = new Animal("不是秃头的小李程序员111");
//        Class c = Animal.class;
//        Field field = c.getDeclaredField("name");
//        field.setAccessible(true);
//        Object value = field.get(animal);
//        System.out.println(value);
        Animal animal = new Animal();
        animal.testFiled();
    }
}

class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name){
        this.name = name;
    }

    public void testFiled() throws Exception {
        Object animal = new Animal("不是秃头的小李程序员222");
        Class c = Animal.class;
        Field field = c.getDeclaredField("name");
        Object value = field.get(animal);
        System.out.println(value);
    }
}

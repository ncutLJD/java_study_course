package com.javastudy.reflection.Methods;

/**
 * @program: java_study_course
 * @description:
 * @author: ljd
 * @create: 2019-12-10 15:32
 */
public class Person {
    public String getName(){
        return "Person";
    }

    String name;

    private void setName(String name) {
        this.name = name;
    }

    public void hello(){
        System.out.println("Person:hello");
    }
}

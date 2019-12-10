package com.javastudy.reflection.Constructors;

/**
 * @program: java_study_course
 * @description:
 * @author: ljd
 * @create: 2019-12-10 19:49
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Person");
    }

    public Person(int age) {
        this.age = age;
        System.out.println("Person age:" + age);
    }

    private Person(String name) {
        this.name = name;
        System.out.println("Person name:" + name);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person toString:" + toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

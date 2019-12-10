package com.javastudy.reflection.Fields;

/**
 * @program: java_study_course
 * @description:
 * @author: ljd
 * @create: 2019-12-10 10:52
 */
public class FiledTest1 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class stdClass = Student.class;
        // 获取 public 字段 "score"
        System.out.println(stdClass.getField("score"));
        // 获取继续的 public 字段 "name"
        System.out.println(stdClass.getField("name"));
        // 获取 private 字段 "grade"
        System.out.println(stdClass.getDeclaredField("grade"));

    }
}

class Student extends Person{
    public int score;
    private int grade;
}

class Person{
    public String name;
}

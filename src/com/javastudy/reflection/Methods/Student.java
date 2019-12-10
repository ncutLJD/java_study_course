package com.javastudy.reflection.Methods;

/**
 * @program: java_study_course
 * @description:
 * @author: ljd
 * @create: 2019-12-10 15:33
 */
public class Student extends Person {
    public int getScore(String type){
        return 99;
    }
    private int getGrade(int year){
        return 1;
    }

    public void hello(){
        System.out.println("Student:hello");
    }
}

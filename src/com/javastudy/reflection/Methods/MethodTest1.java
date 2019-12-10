package com.javastudy.reflection.Methods;

/**
 * @program: java_study_course
 * @description: 通过Class方法获取Method
 * @author: ljd
 * @create: 2019-12-10 15:31
 */
public class MethodTest1 {
    public static void main(String[] args) throws Exception{
        Class c = Student.class;
        // 获取public方法getScore，参数为String;
        System.out.println(c.getMethod("getScore",String.class));
        // 获取继承的public方法getName，无参数;
        System.out.println(c.getMethod("getName"));
        // 获取private方法getGrade，参数为int;
        System.out.println(c.getDeclaredMethod("getGrade",int.class));
    }
}

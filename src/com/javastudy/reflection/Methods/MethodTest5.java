package com.javastudy.reflection.Methods;

import java.lang.reflect.Method;

/**
 * @program: java_study_course
 * @description: 调用非public方法
 * @author: ljd
 * @create: 2019-12-10 18:23
 */
public class MethodTest5 {
    public static void main(String[] args) throws Exception{
        Person p = new Person();
        Method method = p.getClass().getDeclaredMethod("setName", String.class);
        method.setAccessible(true);
        method.invoke(p,"不是秃头的小李程序员");
        System.out.println(p.name);
    }
}

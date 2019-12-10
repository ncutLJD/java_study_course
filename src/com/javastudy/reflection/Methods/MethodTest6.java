package com.javastudy.reflection.Methods;

import java.lang.reflect.Method;

/**
 * @program: java_study_course
 * @description: 多态
 * @author: ljd
 * @create: 2019-12-10 19:22
 */
public class MethodTest6 {
    public static void main(String[] args) throws Exception{
        // 获取Person的hello方法
        Method method = Person.class.getMethod("hello");
        // 对Student实例调用hello方法
        method.invoke(new Student());
    }
}

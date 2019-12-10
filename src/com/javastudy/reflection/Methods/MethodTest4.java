package com.javastudy.reflection.Methods;

import java.lang.reflect.Method;

/**
 * @program: java_study_course
 * @description: 调用静态方法
 * @author: ljd
 * @create: 2019-12-10 18:14
 */
public class MethodTest4 {
    public static void main(String[] args) throws Exception{
        // 获取Integer.parseInt(Stirng)方法，参数是String
        Method method = Integer.class.getMethod("parseInt", String.class);
        // 调用静态方法获取结果
        // Integer result = (Integer)method.invoke("", "12345");
        Integer result = (Integer)method.invoke(null, "12345");
        System.out.println(result);
    }
}

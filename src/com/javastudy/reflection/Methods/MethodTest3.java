package com.javastudy.reflection.Methods;

import java.lang.reflect.Method;

/**
 * @program: java_study_course
 * @description: 通过反射调用方法
 * @author: ljd
 * @create: 2019-12-10 17:58
 */
public class MethodTest3 {
    public static void main(String[] args) throws Exception {
        String s = "不是秃头的小李程序员";
        Method method = String.class.getMethod("substring", int.class);
        Method method2 = String.class.getMethod("substring", int.class, int.class);
        String result = (String) method.invoke(s,7);
        String result2 = (String) method2.invoke(s,1,9);
        System.out.println(result);
        System.out.println(result2);
    }
}

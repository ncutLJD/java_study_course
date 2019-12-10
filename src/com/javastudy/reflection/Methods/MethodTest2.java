package com.javastudy.reflection.Methods;

import java.lang.reflect.Method;

/**
 * @program: java_study_course
 * @description: 获取Method的信息
 * @author: ljd
 * @create: 2019-12-10 17:19
 */
public class MethodTest2 {
    public static void main(String[] args) throws Exception{
        Class c = Student.class;
        Method method= c.getDeclaredMethod("getGrade",int.class);

        System.out.println("name : " + method.getName());
        System.out.println("returnType : " + method.getReturnType());
        Class<?>[] parameterTypes = method.getParameterTypes();
        System.out.println("paramaterTypes的长度 : " + parameterTypes.length);
        for (Class parameterType : parameterTypes){
            System.out.println("paramaterTypes : " + parameterType);
        }
    }
}

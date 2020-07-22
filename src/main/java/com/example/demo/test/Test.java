
package com.example.demo.test;



import java.lang.reflect.Method;

public class Test {
    @Hello("2342")
    public static void main(String[] args) throws NoSuchMethodException {
        Class cla = Test.class;

        Method method = cla.getMethod("main",String[].class);

        Hello h = method.getAnnotation(Hello.class);
        System.out.println(h);

    }



}

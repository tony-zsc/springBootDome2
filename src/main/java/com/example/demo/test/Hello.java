package com.example.demo.test;

import java.lang.annotation.*;


@Target(value = {ElementType.FIELD,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Hello  {
    String value();
}

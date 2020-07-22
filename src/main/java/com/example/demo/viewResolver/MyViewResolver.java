package com.example.demo.viewResolver;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

public class MyViewResolver implements ViewResolver {


    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {
        return null;
    }
}

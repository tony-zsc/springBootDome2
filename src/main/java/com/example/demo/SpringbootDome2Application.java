package com.example.demo;

import com.example.demo.viewResolver.MyViewResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;


@SpringBootApplication
public class SpringbootDome2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDome2Application.class,args);
    }
    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }


}

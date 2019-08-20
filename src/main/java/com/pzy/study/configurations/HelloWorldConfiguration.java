package com.pzy.study.configurations;

import org.springframework.context.annotation.Bean;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/20
 */
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld(){
        System.out.println("hello world!");
        return "hello world";
    }
}

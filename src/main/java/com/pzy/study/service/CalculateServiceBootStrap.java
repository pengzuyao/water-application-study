package com.pzy.study.service;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/20
 */
//@SpringBootApplication(scanBasePackages = "com.pzy.study.service")
@EnableAutoConfiguration
public class CalculateServiceBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(CalculateServiceBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        //CalculateService calculateService = applicationContext.getBean(CalculateService.class);
        //System.out.println(calculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}

package com.pzy.study.lookups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/23
 */
@SpringBootApplication
public class SampleApplication {

    private static final Logger logger = LoggerFactory.getLogger(SampleApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

    /*@Bean
    public CommandLineRunner test(final SingletonBean bean) {
        return (args)-> {
            logger.info("测试单例bean和原型bean的调用");
            int i =0;
            while(i<3) {
                i++;
                bean.print();
            }
        };
    }*/

    /*@Bean
    public CommandLineRunner test(final SingletonBean2 bean) {
        return (args)-> {
            logger.info("测试单例bean和原型bean的调用");
            int i =0;
            while(i<3) {
                i++;
                bean.print();
            }
        };
    }*/

    @Bean
    public CommandLineRunner test(final SingletonBean3 bean) {
        return (args)-> {
            logger.info("测试单例bean和原型bean的调用");
            int i =0;
            while(i<3) {
                i++;
                bean.print();
            }
        };
    }
}

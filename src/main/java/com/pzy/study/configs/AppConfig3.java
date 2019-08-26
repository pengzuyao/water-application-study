package com.pzy.study.configs;

import com.pzy.study.daos.AppTest1;
import com.pzy.study.daos.AppTest2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/23
 */
//@ComponentScan("com.pzy.study.daos")
@Configuration
public class AppConfig3 {


    @Bean
    public AppTest1 appTest1(){
        return new AppTest1();
    }

    @Bean
    public AppTest2 appTest2(){
        appTest1();
        return new AppTest2();
    }
}

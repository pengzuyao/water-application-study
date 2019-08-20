package com.pzy.study.configurations;

import com.pzy.study.annotations.ConditionOnSystemProperty;
import com.pzy.study.annotations.EnableHelloWorld;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/20
 */
@Configuration //springboot 模式注解配置
@EnableHelloWorld //spring @Enable 模块装配
@ConditionOnSystemProperty(name = "user.name" ,value = "pengzuyao") //条件装配
public @interface HelloWorldAutoConfiguration {


}

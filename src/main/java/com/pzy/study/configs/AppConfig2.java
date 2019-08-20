package com.pzy.study.configs;

import com.pzy.study.beanDefinitionRegistrys.scans.MyScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/12
 */

@ComponentScan({"com.pzy.study.components"})
@Configuration
public class AppConfig2 {

}

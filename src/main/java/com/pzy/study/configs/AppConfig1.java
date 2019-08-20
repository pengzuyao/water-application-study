package com.pzy.study.configs;

import com.pzy.study.annotations.EnableAppDaoService;
import com.pzy.study.beanDefinitionRegistrys.scans.MyScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/12
 */

@MyScan({"com.pzy.study.beanDefinitionRegistrys.tests",})
@Configuration
public class AppConfig1 {

}

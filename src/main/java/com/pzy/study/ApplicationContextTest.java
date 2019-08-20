package com.pzy.study;

import com.pzy.study.configs.AppConfig;
import com.pzy.study.configs.AppConfig1;
import com.pzy.study.configs.AppConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/12
 */
public class ApplicationContextTest {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig2.class);
        applicationContext.refresh();

        /*applicationContext.register(AppConfig1.class);
        applicationContext.refresh();*/
    }
}

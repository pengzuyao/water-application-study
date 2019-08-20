package com.pzy.study.beanDefinitionRegistrys.scans;

import com.pzy.study.beanDefinitionRegistrys.MyImportBeanDefinitionRegistry;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/12
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyTest {


}

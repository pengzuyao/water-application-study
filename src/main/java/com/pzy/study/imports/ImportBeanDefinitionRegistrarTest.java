package com.pzy.study.imports;

import com.pzy.study.beanDefinitionRegistrys.scans.MyScan;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/20
 */
public class ImportBeanDefinitionRegistrarTest implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(MyScan.class.getName());
    }
}

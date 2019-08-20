package com.pzy.study.beanDefinitionRegistrys;

import com.pzy.study.beanDefinitionRegistrys.scans.MyScan;
import com.pzy.study.beanDefinitionRegistrys.scans.MyTest;
import com.pzy.study.beanDefinitionRegistrys.tests.Test1;
import org.mybatis.spring.mapper.ClassPathMapperScanner;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

import java.util.Map;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/12
 */
public class MyImportBeanDefinitionRegistry implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {

        Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(MyScan.class.getName());
        String[] basePackages = (String[]) annotationAttributes.get("value");
        if (basePackages == null || basePackages.length == 0){
            String basePage = null;
            try {
                basePage = Class.forName(annotationMetadata.getClassName()).getPackage().getName();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            basePackages = new String[]{basePage};
        }
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(beanDefinitionRegistry , false);
        AnnotationTypeFilter annotationTypeFilter = new AnnotationTypeFilter(MyTest.class);
        scanner.addIncludeFilter(annotationTypeFilter);
        TypeFilter filter = new AssignableTypeFilter(Test1.class);
        scanner.addExcludeFilter(filter);
        scanner.scan(basePackages);
    }
}

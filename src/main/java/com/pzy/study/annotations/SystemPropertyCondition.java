package com.pzy.study.annotations;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;


/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/20
 */
public class SystemPropertyCondition implements Condition {


    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Map<String, Object> map = metadata.getAnnotationAttributes(ConditionOnSystemProperty.class.getName());
        String name = String.valueOf(map.get("name"));
        String valueProperty = String.valueOf(map.get("value"));
        String systemProperty = System.getProperty("user.name");
        return valueProperty.equals(systemProperty);
    }
}

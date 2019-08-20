package com.pzy.study.annotations;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/20
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Conditional(SystemPropertyCondition.class)
public @interface ConditionOnSystemProperty {

    String name();

    String value();
}

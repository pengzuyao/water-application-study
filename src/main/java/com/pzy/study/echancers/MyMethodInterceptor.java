package com.pzy.study.echancers;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import javax.lang.model.element.VariableElement;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/21
 */
public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object object, Method method, Object[] orgs, MethodProxy proxy) throws Throwable {
        System.out.println("增强：方法执行之前》》》");
        Object o = proxy.invokeSuper(object, orgs);
        System.out.println("增强：方法执行之后》》》");
        return o;
    }
}

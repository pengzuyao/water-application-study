package com.pzy.study.proxys;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/21
 */
public class MyInvocationHandler implements InvocationHandler {

    Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("11111");
        return method.invoke(target ,args);
    }
}

package com.pzy.study.echancers;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/21
 */
public class MyEnhancerTest {

    public static void main(String[] args) {
        HelloWorldEnhancer helloWorldEnhancer = new HelloWorldEnhancer();
        MyMethodInterceptor interceptor = new MyMethodInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(helloWorldEnhancer.getClass());
        enhancer.setCallback(interceptor);
        HelloWorldEnhancer helloWorld = (HelloWorldEnhancer) enhancer.create();
        helloWorld.say();
    }
}

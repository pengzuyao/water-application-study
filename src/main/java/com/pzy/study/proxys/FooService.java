package com.pzy.study.proxys;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/21
 */
public class FooService implements Foo {

    @Override
    public String execute() throws Throwable {
        System.out.println("foo test");
        return "foo";
    }
}

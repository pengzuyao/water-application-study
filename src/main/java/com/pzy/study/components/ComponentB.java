package com.pzy.study.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/13
 */
@Component("bbb")
public class ComponentB {

    @Autowired
    private ComponentA componentA;
}

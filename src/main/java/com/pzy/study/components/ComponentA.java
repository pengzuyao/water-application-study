package com.pzy.study.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/13
 */
@Component("aaa")
public class ComponentA {

    @Autowired
    private ComponentB componentB;
}

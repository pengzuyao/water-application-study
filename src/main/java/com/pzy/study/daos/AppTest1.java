package com.pzy.study.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/23
 */
@Component
public class AppTest1 {

    @Autowired
    AppTest2 appTest2;

    public AppTest1() {
        System.out.println("appTest1");
    }
}

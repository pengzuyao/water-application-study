package com.pzy.study.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/23
 */
@Component
public class AppTest2 {

    @Autowired
    AppTest1 appTest1;

    public AppTest2() {
        System.out.println("appTest2");
    }
}

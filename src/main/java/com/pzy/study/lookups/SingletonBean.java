package com.pzy.study.lookups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/23
 */
@Component
public class SingletonBean {

    /*private static final Logger logger = LoggerFactory.getLogger(SingletonBean.class);

    @Autowired
    private PrototypeBean bean;

    public void print() {
        logger.info("Bean SingletonBean's HashCode : {}",bean.hashCode());
        bean.say();
    }*/
}

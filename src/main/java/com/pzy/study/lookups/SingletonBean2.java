package com.pzy.study.lookups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/23
 */
@Component
public class SingletonBean2 {

    private static final Logger logger = LoggerFactory.getLogger(SingletonBean2.class);

    @Autowired
    private ApplicationContext context;

    /*public void print() {
        PrototypeBean bean = getFromApplicationContext();
        logger.info("Bean SingletonBean's HashCode : {}",bean.hashCode());
        bean.say();
    }

    public PrototypeBean getFromApplicationContext(){
       return this.context.getBean(PrototypeBean.class);
    }*/
}

package com.pzy.study.lookups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/23
 */
@Component
public abstract class SingletonBean3 {

    private static final Logger logger = LoggerFactory.getLogger(SingletonBean3.class);


    @Lookup
    protected abstract PrototypeBean methodInject();

    public void print() {
        PrototypeBean bean = methodInject();
        logger.info("Bean SingletonBean's HashCode : {}",bean.hashCode());
        bean.say();
    }
}

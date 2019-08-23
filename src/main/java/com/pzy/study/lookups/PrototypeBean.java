package com.pzy.study.lookups;

import com.sun.deploy.net.protocol.ProtocolType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/23
 */
@Component
@Scope(value = "prototype")
public class PrototypeBean {

    private static final Logger logger= LoggerFactory.getLogger(PrototypeBean.class);

    public void say() {
        logger.info("say something...");
    }
}

package com.pzy.study.annotations;

import com.pzy.study.imports.HelloWorldImportSelector;
import org.springframework.context.annotation.Import;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/20
 */
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}

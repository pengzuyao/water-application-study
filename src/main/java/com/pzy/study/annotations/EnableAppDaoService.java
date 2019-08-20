package com.pzy.study.annotations;

import com.pzy.study.imports.MyImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/12
 */

@Import(MyImportSelector.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EnableAppDaoService {


}

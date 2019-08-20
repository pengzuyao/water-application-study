package com.pzy.study.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/12
 */
public class MyImportSelector implements ImportSelector {


    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.pzy.study.daos.AppDao"};
    }
}

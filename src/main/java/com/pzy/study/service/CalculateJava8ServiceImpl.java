package com.pzy.study.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/20
 */
@Profile("java8")
@Service
public class CalculateJava8ServiceImpl implements CalculateService {

    @Override
    public int sum(Integer... values) {
        System.out.println("java8 实现整数相加求和!");
        return Stream.of(values).reduce(0 ,Integer::sum);
    }
}

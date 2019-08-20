package com.pzy.study.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/20
 */
@Profile("java7")
@Service
public class CalculateJava7ServiceImpl implements CalculateService {

    @Override
    public int sum(Integer... values) {
        System.out.println("java7 实现整数相加求和!");
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}

package com.pzy.study.futures;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/22
 */
public class CommonCook {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        /**
         * 网购厨具
         */
        OnlineShopping thread = new OnlineShopping();
        thread.start();
        /**
         * 保证厨具送到
         */
        thread.join();
        TimeUnit.SECONDS.sleep(2);
        Shicai shicai = new Shicai();
        System.out.println("第二部：食材到位");
        System.out.println("第三部：开始展现厨艺");
        cook(thread.chuju ,shicai);
        System.out.println("总共用时:" + (System.currentTimeMillis() - startTime) +"ms");
    }


    static class OnlineShopping extends Thread {
        private Chuju chuju;

        @Override
        public void run() {
            System.out.println("第一步：下单");
            System.out.println("第一步：等待送货");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("第一步：快递送到");
            chuju = new Chuju();
        }
    }

    /**
     * 用厨具烹饪食材
     */
    static void cook(Chuju chuju ,Shicai shicai){}

    /**
     * 厨具类
     */
    static class Chuju{}

    /**
     * 食材类
     */
    static class Shicai{}


}

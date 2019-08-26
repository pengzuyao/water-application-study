package com.pzy.study.futures;

import java.util.concurrent.*;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/26
 */
public class CompletionServiceTest {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        CompletionService<Integer> completionService = new ExecutorCompletionService<>(threadPool);
        for (int i = 1; i <= 5; i++) {
            final int index = i;
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    if (index == 3){
                        TimeUnit.SECONDS.sleep(3);
                    }
                    return index;
                }
            });
        }
        threadPool.shutdown();
        for (int i = 1; i <=5; i++) {
            try {
                System.out.println("线程：" + completionService.take().get()+"任务执行结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}

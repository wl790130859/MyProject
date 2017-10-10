package com.wanglei.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池生命周期与服务器相同
 */
public class ExecutorServiceSpringTest {

    private ExecutorService fixedThreadPool;

    public void init() {
        System.out.println(this.getClass().getName()+"初始化成功");
        fixedThreadPool = Executors.newFixedThreadPool(4);
//        test("test");
    }

    int money = 100;

    private void test(final String name) {
        fixedThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("\n" + Thread.currentThread().getName() + "开始执行任务s" + name + ">>");
                for (int i = 0; i < 10; i++) {
                    if (money - 1 < 0) return;
                    money = money - 1;
                    System.out.print(name + "-" + i + " " + "剩余" + money);
                }
                System.out.println("\n" + name + "任务执行结束。。");
            }
        });
    }
}
package com.wanglei.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * http://blog.csdn.net/axi295309066/article/details/52915393
 */
public class ExecutorServiceTest {
    /**
     * 初始化线程池的个数
     */
    private ExecutorService executorService = Executors.newFixedThreadPool(2);
    int money =100;
    private void test(final String name){
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("\n"+Thread.currentThread().getName()+"开始执行任务s"+name+">>");
                for(int i=0;i<10;i++){
                    if (money-1 <0) return;
                    money = money-1;
                    System.out.print(name+"-"+i+" "+"剩余"+money);
                }
                System.out.println("\n"+name+"任务执行结束。。");
            }
        });
    }

    public static void main(String[] args) {
        ExecutorServiceTest executorServiceTest = new ExecutorServiceTest();
        for (int i=0;i<100;i++){
            executorServiceTest.test("test"+i);
        }
        executorServiceTest.executorService.shutdown();
    }
}
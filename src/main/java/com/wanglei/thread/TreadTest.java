package com.wanglei.thread;

public class TreadTest {
    /**
     * volatile 保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。
     * 使用volatile关键字会强制将修改的值立即写入主存
     * volatile 不保证原子性    加锁可保证
     * volatile 不能代替synchronized 原因：不保证原子性
     */
    public  volatile int inr =0;

    void add(){
         inr ++;
    }

    public static void main(String[] args) {
        final TreadTest treadTest = new TreadTest();
              for (int i=0; i<10;i++){
                  new Thread(){
                      public void run(){
                          for (int j=0;j<1000;j++){
                             treadTest.add();
                          }

                      }
                  }.start();
              }
        while (Thread.activeCount() > 1)
            //保证前面的线程都执行完

            Thread.yield();
        System.out.println(treadTest.inr);
    }
}
package com.wanglei.design.observable;

import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 自己重写observable方法
 */
public class NewObservable {
    private boolean changed = false;
    private Vector obs;
    private ExecutorService executorService = Executors.newFixedThreadPool(2);

    /**
     * 若这个类在spring容器中 无参的构造器会在容器加载的时候初始化
     */
    public NewObservable() {
        obs = new Vector();
    }

    /**
     * 加锁是为了避免 同时访问该方法时，obs的重复添加
     * @param o
     */
    public synchronized void  addObserver(NewObserver o){
        if (o ==null) throw new NullPointerException();
        if (!obs.contains(o)){
            obs.addElement(o);
        }
    }

    public synchronized void deleteObserver(NewObserver o){
        obs.removeElement(o);
    }

    public synchronized  void deleteObservers(){
        obs.removeAllElements();
    }

    protected synchronized void setChanged(){
        changed = true;
    }

    protected synchronized void clearChanged(){
        changed = false;
    }

    public synchronized int coutObservers(){
        return obs.size();
    }

    public synchronized boolean hasChanged(){
        return changed;
    }

    public void notifyObserver(){
        notifyObserver(null);
    }

    /**
     *  单线程的话 只能等之前的通知了才会通知下一个 因此用多线程来 也可以用线程池来优化
     */
    public  void notifyObserver(final Object arg){
       final Object[] arrLocal;

        synchronized (this){
            if (!changed) return;
            arrLocal=obs.toArray();
            clearChanged();
        }
/**
 * 线程池
 */
        final NewObservable observable =this;
        for (final Object o :arrLocal){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    ((NewObserver)o).update(observable,arg);
                }
            });
        }
        /**
         * 多线程
         */
//        for (final int i= arrLocal.length-1; i>=0; i--)
//            new Thread(new ToUpdate(this,((NewObserver)arrLocal[i]),arg)).start();
    }

     class ToUpdate implements Runnable{
        private NewObservable newObservable;
        private NewObserver newObserver;
        private Object o;

         public ToUpdate(NewObservable newObservable, NewObserver newObserver, Object o) {
             this.newObservable = newObservable;
             this.newObserver = newObserver;
             this.o = o;
         }

         @Override
         public void run() {
            newObserver.update(newObservable,o);
         }
     }

}
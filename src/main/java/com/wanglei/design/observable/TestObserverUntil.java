package com.wanglei.design.observable;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试是否有并发
 */
public class TestObserverUntil {

    public static Map<String, String> TestMap;
    public static Map<String,String> lockMap = new HashMap<String, String>();
   static {
         TestMap = new HashMap<String, String>();
         TestMap.put("a","a");
         TestMap.put("b","b");
    }
    /**
     * 此处是没有加锁会出现并发 但是加synchronized锁效率会变低  可添加缓存锁  在同一个内存中才会发生并发  如果new了两个内存就不存在并发
     * synchronized(this) 中的this必须是同一个对象 synchronized才起作用
     * @param
     */
    public synchronized static Object remove(String key) {

//        Object o = lockMap.put(key,key);
               System.out.println(System.currentTimeMillis());
               Object o = TestMap.get(key);
               System.out.println("lockMap的大小："+lockMap.size());
               System.out.println("查看1:"+TestMap.get(key)+" "+Thread.currentThread().getName());
               if (o!=null){
               System.out.println("查看2:"+TestMap.get(key)+" "+Thread.currentThread().getName());
//             lockMap.remove(key);
               TestMap.remove(key);
                   return "恭喜你"+Thread.currentThread().getName();
               }
               return "有问题"+Thread.currentThread().getName();
    }

}
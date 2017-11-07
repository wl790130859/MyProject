package com.wanglei.until;

import com.baidu.aip.face.AipFace;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author: wanglei
 * @description:   百度云 生成人脸库
 * @date: 2017-10-24
 * @email: wanglei@19lou.com
 */
public class Sample {
        //设置APPID/AK/SK
        public static final String APP_ID = "10275820";
        public static final String API_KEY = "OMNlE3GSMsbxFrGyrnyaKCDN";
        public static final String SECRET_KEY = "TnuSHMlaupswDGxAZDZ0m7W2yglQof1b";

        public static void main(String[] args) throws Exception{

            // 初始化一个AipFace
            AipFace client = new AipFace(APP_ID, API_KEY, SECRET_KEY);

            // 可选：设置网络连接参数
            client.setConnectionTimeoutInMillis(2000);
            client.setSocketTimeoutInMillis(60000);

            // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//            client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//            client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

            // 调用接口
            String path1 = "D://picther/165846_v2_17921453885126496_67ca3cf82d1bd66d1826902bdca2162d.jpg";
            String path2 = "D://picther/middle_600x360-165912_v2_12671453885152480_7fc069bfe96a46a36bacc2b66399e331.jpg";
            String path =  "D://picther/aa.jpg";
            String path3 =  "D://picther/a.jpg";
            String path4 =  "D://picther/bb.jpg";
            String path5 =  "D://picther/cc.jpg";
//            JSONObject res = client.detect(path, new HashMap<String, String>());
//            System.out.println(res.toString(2));
            /**
             * 录入group
             */
            String s = client.addUser("001","zhangsan",Arrays.asList("19l"),path1,new HashMap<String, String>()).toString();
            String ss = client.addUser("002","lisi",Arrays.asList("19l"),path2,new HashMap<String, String>()).toString();
            String sss = client.addUser("002","wanglei",Arrays.asList("19l"),path3,new HashMap<String, String>()).toString();
//            String s = client.deleteUser("001").toString();    //删除
            System.out.println(s);
            System.out.println(ss);
            HashMap<String, Object> options = new HashMap<String, Object>(1);
            options.put("user_top_num", 1);
            /**
             * 识别
             */
            JSONObject ress = client.identifyUser(Arrays.asList("19l","all"), path4, options);
            System.out.println(ress.toString(2));
        }

}
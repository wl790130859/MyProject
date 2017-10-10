package com.wanglei.web;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import java.util.Map;

/**
 * Created by Administrator on 2017/6/13.
 */
@Component
public class HandShkeInceptor extends HttpSessionHandshakeInterceptor {
//    private static final Set<UserBean> ONLINE_USERS = new HashSet<UserBean>();
    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception{
         //这句话不一定要加
//        if(request.getHeaders().containsKey("Sec-WebSocket-Extensions")) {
//            request.getHeaders().set("Sec-WebSocket-Extensions", "permessage-deflate");
//        }
        System.out.println("握手前"+request.getURI());
        return super.beforeHandshake(request, response, wsHandler, attributes);
    }

    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception ex) {
        //握手成功后，通常用来注册用户信息
        System.out.println("握手后");
        super.afterHandshake(request, response, wsHandler, ex);
    }
}

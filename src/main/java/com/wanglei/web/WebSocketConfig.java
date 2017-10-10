package com.wanglei.web;

import org.eclipse.jetty.websocket.api.WebSocketBehavior;
import org.eclipse.jetty.websocket.api.WebSocketPolicy;
import org.eclipse.jetty.websocket.server.WebSocketServerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.jetty.JettyRequestUpgradeStrategy;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

/**
 * http://blog.csdn.net/clj198606061111/article/details/53395977
 * http://blog.csdn.net/linlzk/article/details/50153745
 */
//@Configuration
//@EnableWebSocketMessageBroker
//public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
//    //拦截器注入service失败解决办法
//    @Bean
//    public MyChannelInterceptor myChannelInterceptor(){
//        return new MyChannelInterceptor();
//    }
//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry registry) {
//        //添加访问域名限制可以防止跨域soket连接
//        //setAllowedOrigins("http://localhost:8085")
////        registry.addEndpoint("/websck").setAllowedOrigins("*").addInterceptors(new HandShkeInceptor());
//        registry.addEndpoint("/sockjs/websck/info").setAllowedOrigins("*").addInterceptors(new HandShkeInceptor()).withSockJS();
//
//    }
//
//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry registry) {
//        registry.enableSimpleBroker("/updates");
////      registry.enableStompBrokerRelay("/queue/", "/topic/");
//        registry.setApplicationDestinationPrefixes("/app");
//        /*.enableSimpleBroker("/topic","/queue");*/
//        //假如需要第三方消息队列，比如rabitMQ,activeMq，在这里配置
////        registry.setApplicationDestinationPrefixes("/demo")
////                .enableStompBrokerRelay("/topic","/queue")
////                .setRelayHost("127.0.0.1")
////                .setRelayPort(61613)
////                .setClientLogin("guest")
////                .setClientPasscode("guest")
////                .setSystemLogin("guest")
////                .setSystemPasscode("guest")
////                .setSystemHeartbeatSendInterval(5000)
////                .setSystemHeartbeatReceiveInterval(4000);
//    }
//
//    @Override
//    public void configureClientInboundChannel(ChannelRegistration registration) {
//        ChannelRegistration channelRegistration = registration.setInterceptors(myChannelInterceptor());
//        super.configureClientInboundChannel(registration);
//    }
//
//    @Override
//    public void configureClientOutboundChannel(ChannelRegistration registration) {
//        super.configureClientOutboundChannel(registration);
//    }
//}
@Component
@EnableWebMvc
@EnableWebSocket
public class WebSocketConfig extends WebMvcConfigurerAdapter implements
        WebSocketConfigurer {

     @Autowired
    private WebsocketEndPoint websocketEndPoint;
     @Autowired
     private HandShkeInceptor handShkeInceptor;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        //.setAllowedOrigins("*")
        registry.addHandler(websocketEndPoint, "/websck").addInterceptors(handShkeInceptor).setAllowedOrigins("*");

        System.out.println("registed!");
        registry.addHandler(websocketEndPoint, "/sockjs/websck").addInterceptors(handShkeInceptor).setAllowedOrigins("*").withSockJS();
    }


    @Bean
    public DefaultHandshakeHandler handshakeHandler() {
        WebSocketPolicy policy = new WebSocketPolicy(WebSocketBehavior.SERVER);
        policy.setInputBufferSize(8192); /* 设置消息缓冲大小 */
        policy.setIdleTimeout(600000); /* 10分钟read不到数据的话，则断开该客户端 */
        return new DefaultHandshakeHandler(new JettyRequestUpgradeStrategy(new WebSocketServerFactory(policy)));
    }

}
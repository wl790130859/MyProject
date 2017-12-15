package com.wanglei.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.ArrayList;

@Component
@Slf4j
public class WebsocketEndPoint extends TextWebSocketHandler {

    private static final ArrayList<WebSocketSession> users = new ArrayList<WebSocketSession>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("sahsakd");
        users.add(session);
        String userName = (String) session.getAttributes().get("socket_session_user_agent");
        if(userName!= null){
            //查询未读消息
            log.info(userName+"加入聊天室");
            sendMessageToUsers(new TextMessage("欢迎"+userName+"加入聊天室"),userName);
        }
    }
    @Override
    protected void handleTextMessage(WebSocketSession session,
                                     TextMessage message) throws Exception {
        System.out.println("sadsa");
        String userName = (String) session.getAttributes().get("socket_session_user_agent");
        TextMessage returnMessage = new TextMessage(userName+":"+message.getPayload());
        //自己就不用接收消息了
        sendMessageToUsers(returnMessage,userName);
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        if(session.isOpen()){
            session.close();
        }
        System.out.println(session.getAttributes().get("socket_session_user_agent")+"handleTransportError");
        users.remove(session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        System.out.println(session.getAttributes().get("socket_session_user_agent")+"handleTransportError");
        users.remove(session);
    }

    /**
     * 给所有在线用户发送消息
     *
     * @param message
     */
    public void sendMessageToUsers(TextMessage message,String userName) {
        for (WebSocketSession user : users) {
            try {
                if (user.isOpen() && !user.getAttributes().get("socket_session_user_agent").equals(userName)) {
                    user.sendMessage(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 给某个用户发送消息
     *
     * @param userName
     * @param message
     */
    public void sendMessageToUser(String userName, TextMessage message) {
        for (WebSocketSession user : users) {
            if (user.getAttributes().get("socket_session_user_agent").equals(userName)) {
                try {
                    if (user.isOpen()) {
                        user.sendMessage(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}

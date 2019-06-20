package io.llf.testwebsocket.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class SocketHandler extends TextWebSocketHandler {

    private Integer count = 0;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        logger.info("收到消息:{}",message.getPayloadLength());

        count++;

        session.sendMessage(new TextMessage("当前的count是:"+count));
    }
}

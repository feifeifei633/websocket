package io.llf.testwebsocket.config;

import io.llf.testwebsocket.component.SocketHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistration;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
@Configuration
@EnableWebSocket
public class WebSocket implements WebSocketConfigurer {

    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {

        WebSocketHandlerRegistration webSocketHandlerRegistration = webSocketHandlerRegistry.addHandler(new SocketHandler(),"/user1","/user2","/user3");

        webSocketHandlerRegistration.setAllowedOrigins("*");
    }
}

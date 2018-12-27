package com.comp.okcoinwebsocket.ws.test;

import com.comp.okcoinwebsocket.ws.WebSocketService;
import lombok.extern.slf4j.Slf4j;
/**
 * 订阅信息处理类需要实现WebSocketService接口
 * @author okcoin
 *
 */
@Slf4j
public class BuissnesWebSocketServiceImpl implements WebSocketService {

	@Override
	public void onReceive(String msg){
		
		log.info("WebSocket Client received message: " + msg);
	
	}
}

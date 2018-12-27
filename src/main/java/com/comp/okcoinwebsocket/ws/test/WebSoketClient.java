package com.comp.okcoinwebsocket.ws.test;


import com.comp.okcoinwebsocket.ws.WebSocketBase;
import com.comp.okcoinwebsocket.ws.WebSocketService;
/**
 * 通过继承WebSocketBase创建WebSocket客户端
 * @author okcoin
 *
 */
public class WebSoketClient extends WebSocketBase {
	public WebSoketClient(String url, WebSocketService service){
		super(url,service);
	}
}

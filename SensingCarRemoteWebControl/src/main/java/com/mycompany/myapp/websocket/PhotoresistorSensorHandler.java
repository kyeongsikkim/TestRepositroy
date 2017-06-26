package com.mycompany.myapp.websocket;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.Vector;

import javax.annotation.PostConstruct;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapHandler;
import org.eclipse.californium.core.CoapObserveRelation;
import org.eclipse.californium.core.CoapResponse;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class PhotoresistorSensorHandler extends TextWebSocketHandler implements ApplicationListener{
	private static final Logger logger = LoggerFactory.getLogger(PhotoresistorSensorHandler.class);
	private List<WebSocketSession> list = new Vector<>();
	private CoapClient coapClient;
	private CoapObserveRelation coapObserveRelation;	
		
	
	@PostConstruct
	public void init() {
		coapClient =new CoapClient();
		coapClient.setURI("coap://192.168.3.34:5683/photoresistorsensor");
		coapObserveRelation =coapClient.observe(new CoapHandler() {
			
			@Override
			public void onLoad(CoapResponse response) {
				String json=response.getResponseText();
				JSONObject jsonObject=new JSONObject(json);
				double photoresistor= Double.parseDouble(jsonObject.getString("photoresistor"));
			
					jsonObject.put("time", getUTCTime(new Date().getTime()));
					jsonObject.put("photoresistor", photoresistor);
				
				json=jsonObject.toString();
				for(WebSocketSession session:list){
					try {
						session.sendMessage(new TextMessage(json));
					} catch (IOException e) {}
				}
			}
			
			@Override
			public void onError() {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		logger.info("");
		list.add(session);
	}
	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		logger.info("");
	}
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		logger.info("");
		list.remove(session);		
	}
	
	public long getUTCTime(long localTime) {
		long utcTime = 0;
		TimeZone tz = TimeZone.getDefault();
		try {
			int offset = tz.getOffset(localTime);
			utcTime = localTime + offset;
		} catch(Exception e) {}
		return utcTime;
	}

	@Override
	public void onApplicationEvent(ApplicationEvent event) {//웹어플리케이션이 종료 됐을 때 끊어줘야 한다.
		if(event instanceof ContextClosedEvent){//이벤트가 종료되면 종료된걸로 알겠다.
			coapObserveRelation.proactiveCancel();
			coapClient.shutdown();
		}
		
	}
}





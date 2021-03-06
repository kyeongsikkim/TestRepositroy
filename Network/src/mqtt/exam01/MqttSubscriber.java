//package mqtt.exam01;
//
//import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
//import org.eclipse.paho.client.mqttv3.MqttCallback;
//import org.eclipse.paho.client.mqttv3.MqttClient;
//import org.eclipse.paho.client.mqttv3.MqttException;
//import org.eclipse.paho.client.mqttv3.MqttMessage;
//
//public class MqttSubscriber {
//	//Field
//	private MqttClient mqttClient;
//	
//	private MqttCallback mqttCallback=new MqttCallback(){
//		@Override
//		public void connectionLost(Throwable thrwbl) {
//		
//		}
//
//		@Override
//		public void messageArrived(String string, MqttMessage mm) throws Exception {
//			String text=new String(mm.getPayload());
//			System.out.println("messageArrived"+text);
//		}
//
//		@Override
//		public void deliveryComplete(IMqttDeliveryToken imdt) {
//		}
//	};
//	
//	//constructor
//	public MqttSubscriber() throws MqttException{
//		//MQTT 클라이언트 생성
//		mqttClient=new MqttClient("tcp://192.168.3.34:1883",MqttClient.generateClientId());//연결은 이루어지는것이다.
//		//통신 결과에 따라 콜백 메소드를 실행할 콜백 객체 생성
//		mqttClient.setCallback(mqttCallback);
//			//MQTT 브로커와 연결하기
//		mqttClient.connect();
//	}
//	//method
//	public void subscribe(String text) throws MqttException{
//	//지정한 토픽에서부터 메시지 받기(구독자 신청) 지정한 토픽에 구독자로 신청 하기
//		mqttClient.subscribe("/devices/device1/temperature");//첫번째는 topic 의 경로 두번째는 메세지 객체 
//	}
//	
//	public void shutdown() throws MqttException{
//		//MQTT 브로커와 연결 끊기 
//		mqttClient.disconnect();
//		//MQTT client 가 사용한 리소스(메모리)를 해제 
//		mqttClient.close();
//	}
//	public static void main(String[]args) throws Exception{
//		MqttSubscriber subscriber=new MqttSubscriber();
//		//구독자로 신청하기
//		subscriber.subscribe();
//		System.out.println("start subscriber....");
//		System.out.println("press any key to quit");
//		System.in.read();
//		subscriber.shutdown();
//
//	}
//
//
//}
package mqtt.exam01;

import java.util.Date;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MqttSubscriber {
	//Field
	private MqttClient mqttClient;
	
	private MqttCallback mqttCallback = new MqttCallback() {
		@Override
		public void connectionLost(Throwable thrwbl) {
		}
		@Override
		public void messageArrived(String string, MqttMessage mm) throws Exception {
			String text = new String(mm.getPayload());
			System.out.println("messageArrived: " + text);
		}
		@Override
		public void deliveryComplete(IMqttDeliveryToken imdt) {
		}
	};
	
	//Constructor
	public MqttSubscriber() throws MqttException {
		//MQTT 클라이언트 생성
		mqttClient = new MqttClient("tcp://192.168.3.131:1883", MqttClient.generateClientId());
		//통신 결과에 따라 콜백 메소드를 실행할 콜백 객체 생성
		mqttClient.setCallback(mqttCallback);
		//MQTT 브로커와 연결하기
		mqttClient.connect();
	}

	//Method
	public void subscribe() throws MqttException {
		//지정한 톱픽의 구독자로 신청
		mqttClient.subscribe("/devices/device1/temperature");
	}
	
	public void shutdown() throws MqttException {
		//MQTT 브로커와 연결 끊기
		mqttClient.disconnect();
		//MqttClient가 사용한 리소스(메모리)를 해제
		mqttClient.close();
	}
	
	public static void main(String[] args) throws Exception {
		MqttSubscriber subscriber = new MqttSubscriber();
		//구독자로 신청 
		subscriber.subscribe();
		System.out.println("start subscriber....");
		
		//프로그램이 종료되지 않게 멈춤 언제 메세지가 도착 할지 모른다. 그래서 read 로 대기 하고 있는다.
		System.out.println("press any key to quit");
		System.in.read();
		
		//클라이언트 종료
		subscriber.shutdown();
	}
}

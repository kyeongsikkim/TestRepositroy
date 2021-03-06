package mqtt.exam01;

import java.util.Date;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MqttPublisher {
	//Field
	private MqttClient mqttClient;
	
	private MqttCallback mqttCallback=new MqttCallback(){
		@Override
		public void connectionLost(Throwable thrwbl) {
		
		}

		@Override
		public void messageArrived(String string, MqttMessage mm) throws Exception {
			
		}

		@Override
		public void deliveryComplete(IMqttDeliveryToken imdt) {
			System.out.println("deliveryComplete"+ new Date());
		}
	};
	
	//constructor
	public MqttPublisher() throws MqttException{
		//MQTT 클라이언트 생성 브로커의 주소 ip 주소를 친다. mqtt port 번호이다. 고유 클라이언티 ID 이다.자동으로 만들어준다.
		mqttClient=new MqttClient("tcp://192.168.3.131:1883",MqttClient.generateClientId());//연결은 이루어지는것이다.
		//통신 결과에 따라 콜백 메소드를 실행할 콜백 객체 생성
		mqttClient.setCallback(mqttCallback);
		//MQTT 브로커와 연결하기
		mqttClient.connect();
	}
	//method 메세지를 보내는 쪽이다. 메세지를 만드는 곳을 만든다.
	public void publish(String text) throws MqttException{
		//MQTT 브로커로 보내는 메시지 생성 
		MqttMessage message =new MqttMessage(text.getBytes());
		//MQTT 브로커로 메시지 보냄 메세지를 발행해라 이런 의미이다.경로에 있는 topic 에다가 보낸다.메세지를 보내면 scriber 에서 message 가 실행이 된다.
		mqttClient.publish("/devices/device1/temperature", message);//첫번째는 topic 의 경로 두번째는 메세지 객체 
	}
	
	public void shutdown() throws MqttException{
		//MQTT 브로커와 연결 끊기 
		mqttClient.disconnect();
		//MQTT client 가 사용한 리소스(메모리)를 해제 
		mqttClient.close();
	}
	public static void main(String[]args) throws Exception{
		MqttPublisher publisher=new MqttPublisher();
		//매 1초단위로 온도메세지를 보냄 
		for(int i=1;i<5;i++){
			publisher.publish("temperature"+i);
			Thread.sleep(1000);
		}
		//클라이언트 종료
		publisher.shutdown();
	}
}

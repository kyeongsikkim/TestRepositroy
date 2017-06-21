package mqtt.exam02;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.json.JSONObject;

public class Distributor {
	//Field
	private String url="tcp://localhost:1883";
	private String clientId="distributor";
	private String deviceRequest="/devices/+/request";//디바이스가 보내는 모든 메세지는 다 받는다.
	private String deviceResponse="/devices/%s/response";//응답은 특정 디바이스로 보내야 한다. 매개 변수화하는 것은 %s
	private int qos=1;
	private MqttClient mqttClient;
	
	private MqttCallback callback = new MqttCallback() {//callback 을 알려준다.
		@Override
		public void deliveryComplete(IMqttDeliveryToken imdt) {
		}

		@Override//메세지 도착한 부분
		public void messageArrived(String string, MqttMessage mm) throws Exception {
			publish(mm.toString());
		}

		@Override//연결이 끊기 면 close 를 호출 
		public void connectionLost(Throwable thrwbl) {
			try {
				close();
			} catch (MqttException ex) {
				ex.printStackTrace();
			}
		}
	};
	//constructor
	public Distributor() throws MqttException{
		mqttClient=new MqttClient(url,clientId);
		mqttClient.setCallback(callback);
		mqttClient.connect();
	}
	

	//method
	public void subscribe() throws MqttException{
	mqttClient.subscribe(deviceRequest);
	}
	public void publish(String json) throws MqttException{
	JSONObject jsonObject=new JSONObject(json);
	String to=jsonObject.getString("to");
	String targetResponse=String.format(deviceResponse, to);
	MqttMessage mqttMessage=new MqttMessage(json.getBytes());
	mqttMessage.setQos(qos);
	mqttClient.publish(targetResponse, mqttMessage);
	
	
	}

	public void close() throws MqttException {
		if(mqttClient != null) {
			mqttClient.disconnect();
			mqttClient.close();
			mqttClient = null;
		}
	}
}

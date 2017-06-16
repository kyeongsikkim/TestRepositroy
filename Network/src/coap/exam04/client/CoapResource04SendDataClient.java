package coap.exam04.client;

import java.util.Random;
import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.coap.MediaTypeRegistry;
import org.json.JSONObject;

public class CoapResource04SendDataClient {
	//field
	private CoapClient coapClient;
	
	public CoapResource04SendDataClient(){
		coapClient=new CoapClient();
	}
	public void post(){
		coapClient.setURI("coap://192.168.3.34/resource04");
		Random random=new Random();
		while(true){
			JSONObject jsonObject=new JSONObject();//생성이다./
			jsonObject.put("value", random.nextInt(50));
			String json=jsonObject.toString();
			coapClient.post(json, MediaTypeRegistry.APPLICATION_JSON);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
			}
		}
	}
		public void shutdown(){
			coapClient.shutdown();
		}
		public static void main(String[]args){
			CoapResource04SendDataClient client=new CoapResource04SendDataClient();
			client.post();
			client.shutdown();
	}

}

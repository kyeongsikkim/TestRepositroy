package coap.exam04.client;//이런 경우가 외부에서 데이터를 받아서 사용 하는 경우이다.

import java.io.IOException;
import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapHandler;
import org.eclipse.californium.core.CoapObserveRelation;
import org.eclipse.californium.core.CoapResponse;

public class CoapResource04Client {
	//Field
	private CoapClient coapClient;
	private CoapObserveRelation coapObserveRelation;
	
	//Constructor
	public CoapResource04Client() {
		coapClient = new CoapClient();
	}
	
	//Method
	public void observe() {
		coapClient.setURI("coap://192.168.3.34/resource04");
		coapObserveRelation = coapClient.observe(new CoapHandler() {
			@Override
			public void onLoad(CoapResponse response) {
				String text = response.getResponseText();
				System.out.println(text);
			}
			@Override
			public void onError() {
			}
		});
	}
	
	public void shutdown() {
		coapObserveRelation.proactiveCancel();
		coapClient.shutdown();
	}
	
	public static void main(String[] args) throws IOException {
		CoapResource04Client client = new CoapResource04Client();
		client.observe();
		System.in.read();
		client.shutdown();
	}
}

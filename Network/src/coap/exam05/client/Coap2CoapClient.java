package coap.exam05.client;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.Request;

public class Coap2CoapClient {
//Field
	private CoapClient coapClient;
//Constructor
	
	public Coap2CoapClient(){
		coapClient=new CoapClient();
		coapClient.useCONs();
	}
//Method
	public String coap2coap(){
		//proxy의 접근 주소 
		 coapClient.setURI("coap://192.168.3.34:5683/coap2coap");
		 //Foward 되는 타겟 리소스의 통신 방법
		 Request request=new Request(CoAP.Code.GET);
		 //Foward 되는 리소스의 uri
		 request.getOptions().setProxyUri("coap://localhost/resource01");
		 //request.getOptions().setProxyScheme("coap://192.168.3.34/resource01");
		 
		 //통신
		 CoapResponse response=coapClient.advanced(request);
		 if(response.getCode()==CoAP.ResponseCode.CONTENT){
			 return response.getResponseText();
		 }else{
			 return null;
		 }
	}
	public void shutdown(){
		coapClient.shutdown();
	}
	public static void main(String[]args){
		Coap2CoapClient client=new Coap2CoapClient();
		String text=client.coap2coap();
		System.out.println(text);
		client.shutdown();
	}
}

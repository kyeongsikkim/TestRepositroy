package coap.exam01.server;

 //다양한 리소스가 있을 수가 있다 다양한 센서가 달려있으면 센싱카가 서버 일경우에 서버는 통신을위한것 
import java.io.IOException;
import java.net.InetSocketAddress;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.network.CoapEndpoint;


public class CoapResourceServer {
	//field
	private CoapServer coapServer;
	
	//constructor
	public CoapResourceServer(){
		coapServer =new CoapServer();
		InetSocketAddress isa=new InetSocketAddress("192.168.3.34",5683);
		coapServer.addEndpoint(new CoapEndpoint(isa));
		//안테나 아니면 내장 와이 파이를 잡게 된다. 그래서 두개 중에 아무거나 잡게 된다.
		coapServer.add(new CoapResource01());
		
		coapServer.start();
	}
	
	//method
	public void shutdown(){
		coapServer.stop();
		coapServer.destroy();
	}
	
	public static void main(String[]args) throws IOException{
		CoapResourceServer server=new CoapResourceServer();
		System.out.println("CoAP server is listening on port 5683" );//기본 포트가 있다.모든 coap 서버는 포트번호가 일치해야 다른장치에서 접근한다.5683 
		System.in.read();
		server.shutdown();
	}
	
	
}

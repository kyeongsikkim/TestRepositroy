package coap.exam04.server;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class CoapResource03 extends CoapResource {
	//Field
	private int value;
	//Constructor
	public CoapResource03(){
		super("resource03");//식별이름을 넣어준다.
		//관찰 기능 활성화
		setObservable(true);
		//관찰 기능을 제공한다라는 것을 클라이언트가 알 수 있도록 설정하는것
		getAttributes().setObservable();
		
		//테스트 
		Thread thread=new Thread(){
			@Override
			public void run() {
				int i=0;
				while(true){
					value=i;
					changed();
					i++;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
					}
				}
			}
			
		};
		thread.start();
	}
	
	//method

	@Override//get은 데이터를 받지 못한다. get은 관찰을 요청한 클라이언트한테 보내는 역할만 하게 된다.
	public void handleGET(CoapExchange exchange) {
		exchange.respond("value="+value);
	}

	@Override//외부로 부터 받은 값을 받아 검사하는 기능을 한다.
	public void handlePOST(CoapExchange exchange) {
	}
	
}

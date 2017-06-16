package coap.exam04.server;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.buzzer.ActiveBuzzer;
import hardware.converter.PCF8591;
import hardware.sensor.GasSensor;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class CoapResource06 extends CoapResource {

	//Field
	private String value;

	//Constructor
	public CoapResource06() {
		super("resource06");//식별이름을 넣어준다.
		//관찰 기능 활성화
		setObservable(true);
		//관찰 기능을 제공한다라는 것을 클라이언트가 알 수 있도록 설정하는것
		getAttributes().setObservable();

		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN2);
		GasSensor test = new GasSensor(pcf8591, RaspiPin.GPIO_23);
		ActiveBuzzer test1 = new ActiveBuzzer(RaspiPin.GPIO_24);
		//테스트 
		Thread thread = new Thread() {
			@Override
			public void run() {
				test.setGpioPinListenerDigital(new GpioPinListenerDigital() {
					@Override
					public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
						if (event.getState() == PinState.LOW) {
							value="**********가스 발생****************";
							test1.on();
							changed();
						} else {
							value="**********정상 가스*****************";
							test1.off();
							changed();
						}
					}
				});
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
				}
			}
	};
	thread.start ();
}

//method
@Override//get은 데이터를 받지 못한다. get은 관찰을 요청한 클라이언트한테 보내는 역할만 하게 된다.
		public void handleGET(CoapExchange exchange) {
		exchange.respond(value);

	}

	@Override//외부로 부터 받은 값을 받아 검사하는 기능을 한다.
		public void handlePOST(CoapExchange exchange) {
	}

}

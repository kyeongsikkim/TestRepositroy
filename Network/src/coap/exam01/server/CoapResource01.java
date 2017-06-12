package coap.exam01.server;

import hardware.converter.PCF8591;
import hardware.sensor.ThermistorSensor;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class CoapResource01 extends CoapResource{
//field
	private ThermistorSensor thermistorSensor;
//constructor
	public CoapResource01(){
		
		super("resource01");//리소스 식별명
		PCF8591 pcf8591=new PCF8591(0x48,PCF8591.AIN1);
		thermistorSensor=new ThermistorSensor(pcf8591);
	}
//method 


	@Override
	public void handleGET(CoapExchange exchange) {
		try {
			double value=thermistorSensor.getValue();
				exchange.respond("온도:섭씨"+value+"도");//실제 보내는 데이터
		} catch (Exception ex) {
		}
	}
}

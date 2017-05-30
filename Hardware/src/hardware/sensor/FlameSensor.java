package hardware.sensor;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.converter.PCF8591;

public class FlameSensor {
//Field
	private PCF8591 pcf8591;
	private GpioPinDigitalInput gpioPinDigitalInput;
	
//Constructor
	public FlameSensor(PCF8591 pcf8591,Pin digitalPinNo){
		this.pcf8591=pcf8591;
		GpioController gpioController=GpioFactory.getInstance();
		gpioPinDigitalInput=gpioController.provisionDigitalInputPin(digitalPinNo);
		gpioPinDigitalInput.setShutdownOptions(true, PinState.LOW);
	}
	public void setGpioPinListenerDigital(GpioPinListenerDigital listener){
		gpioPinDigitalInput.addListener(listener);
	}
//Method
	public double getValue() throws Exception{
		int analogVal =pcf8591.analogRead();//0~255
		return analogVal;
	}
	
	public static void main(String[]args) throws Exception{
		PCF8591 pcf8591=new PCF8591(0x48,PCF8591.AIN0);
		FlameSensor test=new FlameSensor(pcf8591,RaspiPin.GPIO_00);
		//방법1:digital 핀의 상태를 이용하는 하는방법
	
		//	test.setGpioPinListenerDigital(event->{
		//	
		//	});
		test.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				System.out.println("########################"+event.getState());
				if(event.getState()==PinState.LOW){
					System.out.println("**********fire****************");
				}else{
					System.out.println("**********noraml**********");
				}
			}
	});

		while(true){
			//아날로그값
			double value=test.getValue();
			if(value<100){
				//analog 신호 위치
			}
			
			System.out.println(value);
			Thread.sleep(1000);
		}

	}
}

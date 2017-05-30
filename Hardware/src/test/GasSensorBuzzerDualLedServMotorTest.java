package test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.buzzer.ActiveBuzzer;
import hardware.converter.PCF8591;
import hardware.led.DualColorLed;
import hardware.motor.SG90Servo;
import hardware.sensor.GasSensor;

public class GasSensorBuzzerDualLedServMotorTest {

	public static void main(String[]args) throws Exception{
		ActiveBuzzer activeBuzzer=new ActiveBuzzer(RaspiPin.GPIO_01);
		DualColorLed dualColorLed = new DualColorLed(RaspiPin.GPIO_21, RaspiPin.GPIO_22);
		PCF8591 pcf8591=new PCF8591(0x48,PCF8591.AIN0);
		GasSensor test=new GasSensor(pcf8591,RaspiPin.GPIO_00);
		SG90Servo sG90Servo=new SG90Servo(RaspiPin.GPIO_24,8,27);
		//방법1:digital 핀의 상태를 이용하는 하는방법
	
		//	test.setGpioPinListenerDigital(event->{
		//	
		//	});
		test.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				System.out.println("########################"+event.getState());
				if(event.getState()==PinState.LOW){
					System.out.println("**********GAS****************");
					if(activeBuzzer.getStatus().equals("off")){
						activeBuzzer.on();
					}
					dualColorLed.red();
					sG90Servo.setAngle(180);
				}else{
						if(activeBuzzer.getStatus().equals("on")){
						activeBuzzer.off();
						}
						dualColorLed.green();
						sG90Servo.setAngle(0);
						
					}
						
					System.out.println("**********Normal**********");
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

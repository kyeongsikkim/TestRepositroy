package test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.buzzer.ActiveBuzzer;
import hardware.converter.PCF8591;
import hardware.led.RgbLedDigital;
import hardware.sensor.FlameSensor;
import java.io.IOException;

public class FlameSensorBuzzerDualLedTest {

	public static void main(String []args) throws IOException{
		PCF8591 pcf8591=new PCF8591(0x48,PCF8591.AIN0);
		FlameSensor test=new FlameSensor(pcf8591,RaspiPin.GPIO_00);
		RgbLedDigital rgbLedDigital = new RgbLedDigital(RaspiPin.GPIO_27, RaspiPin.GPIO_28, RaspiPin.GPIO_29);
		ActiveBuzzer activeBuzzer=new ActiveBuzzer(RaspiPin.GPIO_01);
		test.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				System.out.println("########################"+event.getState());
				if(event.getState()==PinState.LOW){
					rgbLedDigital.rgb(true, false, false);
					activeBuzzer.on();
					System.out.println("**********fire****************");
				}else{
					rgbLedDigital.rgb(false, true, false);
					activeBuzzer.off();
					System.out.println("**********noraml**********");
				}
			}
	});
		System.in.read();
	}
}

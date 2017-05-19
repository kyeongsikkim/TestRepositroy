package test;

import com.pi4j.io.gpio.PinState;
import static com.pi4j.io.gpio.RaspiPin.GPIO_00;
import static com.pi4j.io.gpio.RaspiPin.GPIO_01;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.button.Button;
import hardware.buzzer.ActiveBuzzer;
import java.io.IOException;

public class ButtonActiveBuzzerTest {
public static void main(String []args) throws IOException{
	Button button=new Button(GPIO_01);
	ActiveBuzzer test=new ActiveBuzzer(GPIO_00);
	button.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if(event.getState() == PinState.LOW) {
					test.on();
				} else {
					test.off();
					
				}
			}
			
		});
		
		System.out.println("ready....");
		System.in.read();
}
}

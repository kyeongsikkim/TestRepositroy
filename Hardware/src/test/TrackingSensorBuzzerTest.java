package test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import hardware.buzzer.ActiveBuzzer;
import hardware.sensor.TrackingSensor;
import java.io.IOException;

public class TrackingSensorBuzzerTest {
public static void main(String[]args) throws IOException{
	TrackingSensor trackingSensor=new TrackingSensor(RaspiPin.GPIO_00);
			
	ActiveBuzzer activeBuzzer=new ActiveBuzzer(RaspiPin.GPIO_01);
	trackingSensor.setGpioPinlistenerDigtal(event->{
		if(event.getState()==PinState.HIGH){
			activeBuzzer.off();
			System.out.println("black");
		}else{
			activeBuzzer.on();
			System.out.println("white");
		}
		});
		System.out.println("Ready");
		System.in.read();
	}
}


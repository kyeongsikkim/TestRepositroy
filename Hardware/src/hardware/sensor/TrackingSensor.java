package hardware.sensor;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import java.io.IOException;

public class TrackingSensor {
//Field
	private GpioPinDigitalInput trackingPin;
	
//Constructor 생성자 주입
	public TrackingSensor(Pin trackingPinNo){
		GpioController gpioController=GpioFactory.getInstance();
		trackingPin=gpioController.provisionDigitalInputPin(trackingPinNo);
		trackingPin.setShutdownOptions(true,PinState.LOW);
	}
	public void setGpioPinlistenerDigtal(GpioPinListenerDigital gpioPinListenerDigital){
		trackingPin.addListener(gpioPinListenerDigital);
	}
	public PinState getStatus(){
		return trackingPin.getState();
	}
	public static void main(String[]args) throws IOException{
		TrackingSensor test=new TrackingSensor(RaspiPin.GPIO_26);
		test.setGpioPinlistenerDigtal(event->{
		if(event.getState()==PinState.HIGH){
			System.out.println("black");
		}else{
			System.out.println("white");
		}
		});
		System.out.println("Ready");
		System.in.read();
	}
	
//Method
}

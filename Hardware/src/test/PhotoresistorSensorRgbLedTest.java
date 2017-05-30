package test;

import com.pi4j.io.gpio.RaspiPin;
import hardware.converter.PCF8591;
import hardware.led.RgbLedPWM;
import hardware.sensor.PhotoresistorSensor;

public class PhotoresistorSensorRgbLedTest {


public static void main(String[]args) throws Exception{
		PCF8591 pcf8591=new PCF8591(0x48,PCF8591.AIN0);
		RgbLedPWM rgbLedPWM = new RgbLedPWM(RaspiPin.GPIO_00, RaspiPin.GPIO_02, RaspiPin.GPIO_03);
		PhotoresistorSensor test=new PhotoresistorSensor(pcf8591);
		while(true){
			double value=test.getValue();
			if(value<20){
				rgbLedPWM.ledColorSet(255, 255, 255);
			}
			else if(value>20 && value<30){
				rgbLedPWM.ledColorSet(255, 0, 0);
			}else if(value>=30 && value<100){
				rgbLedPWM.ledColorSet(0, 255, 0);
			}else if(value>100 ){
				rgbLedPWM.ledColorSet(0, 0, 255);
			}
			System.out.println(value);
			
			Thread.sleep(1000);
		}
	}
}

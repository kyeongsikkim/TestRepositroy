package hardware.led;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinPwmOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.RaspiPin;
import java.io.IOException;

public class RgbLedPWM {
//필드

	private GpioPinPwmOutput redPin;
	private GpioPinPwmOutput greenPin;
	private GpioPinPwmOutput bluePin;

	private int[] currColorSet = new int[3];

//생성자
	public RgbLedPWM(Pin redPinNo, Pin greenPinNo, Pin bluePinNo) {
		GpioController gpioController = GpioFactory.getInstance();//싱글톤으로 얻는것 메소드를 통해서 객체 생성
		//소프트웨어 PWM 출력 핀 객체 생성

		redPin = gpioController.provisionSoftPwmOutputPin(redPinNo);
		//제어단계를 255단계로 나타낸다.최소한의 pwm 의 단계가 있기때문에 255단계까지로 나누지만 실질적으로 255단계로 나눠서 할 수 없다.
		redPin.setPwmRange(255);//기본 100단계로 정해져 있다.

		///////////////////////////////////////////////////////////////////////
		greenPin = gpioController.provisionSoftPwmOutputPin(greenPinNo);
		greenPin.setPwmRange(255);

		////////////////////////////////////////////////////////////////////////
		bluePin = gpioController.provisionSoftPwmOutputPin(bluePinNo);
		bluePin.setPwmRange(255);
		
		redPin.setPwm(0);
		greenPin.setPwm(0);
		bluePin.setPwm(0);

		
		//ledColorSet(0, 0, 0);
	}

////메소드
//public void red(int value){
//	value=255-value;
//	redPin.setPwm(value);
//	
//}
//public void green(int value){
//	value=255-value;
//	greenPin.setPwm(value);
//	
//}
//public void blue(int value){
//	value=255-value;
//	bluePin.setPwm(value);
//	


	public void ledColorSet(int r, int g, int b) {
		currColorSet[0]=r;
		currColorSet[1]=g;
		currColorSet[2]=b;
		r = 255 - r;
		g = 255 - g;
		b = 255 - b;
		redPin.setPwm(r);
		greenPin.setPwm(g);
		bluePin.setPwm(b);

	}

	public int[] getCurrColorSet() {
		return currColorSet;
	}	

	public static void main(String[] args) throws IOException, InterruptedException {
		RgbLedPWM test = new RgbLedPWM(RaspiPin.GPIO_04, RaspiPin.GPIO_05, RaspiPin.GPIO_06);

		test.ledColorSet(255, 0, 0);
		Thread.sleep(1000);
		test.ledColorSet(0, 255, 0);
		Thread.sleep(1000);
		test.ledColorSet(0, 0, 255);
		Thread.sleep(1000);
		test.ledColorSet(255, 255, 0);
		Thread.sleep(1000);
		test.ledColorSet(255, 0, 255);
		Thread.sleep(1000);
		test.ledColorSet(0, 255, 255);
		Thread.sleep(1000);
		test.ledColorSet(0, 0, 0);

	}
}

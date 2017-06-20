package hardware.sensor;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class UltrasonicSensor {
//Field

	private GpioPinDigitalOutput trigPin;
	private GpioPinDigitalInput echoPin;

	private int previousDistance;
	private boolean again;
	private int count;
//생성자

	public UltrasonicSensor(Pin trigPinNo, Pin echoPinNo) {
		GpioController gpioController = GpioFactory.getInstance();
		trigPin = gpioController.provisionDigitalOutputPin(trigPinNo, PinState.LOW);
		trigPin.setShutdownOptions(true, PinState.LOW);

		echoPin = gpioController.provisionDigitalInputPin(echoPinNo);
		echoPin.setShutdownOptions(true, PinState.LOW);
	}

	public int getDistance() {
		//초음파 발신 시간 변수와 수신 시간 변수 선언 
		double start = 0;
		double end = 0;

		//초음파를 10 마이크로초 동안 발생 
		trigPin.high();

		try {
			Thread.sleep(0, 10000);
		} catch (InterruptedException ex) {
		}
		trigPin.low();
		count = 0;

		//echoPin 이 High 가 될때 까지 체크 
		while (echoPin.isLow()) {
			count++;
			if (count > 50000) {
				return getDistance();
			}
		}
		//발신 시간을 저장 
		start = System.nanoTime();
		count = 0;
	
		while (echoPin.isHigh()) {
			count++;
			if (count > 50000) {
				return getDistance();
			}
		}

	
		end = System.nanoTime();
		double seconds = ((end - start) / 1000000000) / 2;
		//거리
		int distance = (int) (seconds * 34000);
		//100이상 티는 값이 있을 경우 다시 측정
		if (again == false && Math.abs(previousDistance - distance) > 100) {
			again = true;
			getDistance();//dummy read
			distance = getDistance();
		} else {
			again = false;
		}
		//초과값 검사(2cm~400cm)
		if (distance < 2) {
			distance = 2;
		} else if (distance > 400) {
			distance = 400;
		}
		previousDistance = distance;
		return distance;
	}

//메소드
	public static void main(String[] args) throws Exception {
		UltrasonicSensor test = new UltrasonicSensor(RaspiPin.GPIO_28, RaspiPin.GPIO_29);
		while (true) {

			Thread.sleep(1000);
			int distance = test.getDistance();
			System.out.println(distance);

		}
	}
}

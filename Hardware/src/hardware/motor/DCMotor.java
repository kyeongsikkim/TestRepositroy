package hardware.motor;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class DCMotor {
	//Field 모토 드라이버 한테 보내는 것이다.
	//정방향 또는 역방향 제어
	private GpioPinDigitalOutput out1;//high RaspiPin.GPio_00
	private GpioPinDigitalOutput out2;//low 일경우는 정방향     반대는 역방향 이다.RaspiPin.GPio_01 이다.

	//속도 제어를 위한것
	private PCA9685 pca9685;
	private Pin pwm;//0부터 15 까지 제어 가능한 PCA9685.PWM_00부터 ~PWM_15 까지 
	
	
	
	//constructor
	public DCMotor(Pin out1,Pin out2,PCA9685 pca9685,Pin pwm){
		GpioController gpioController=GpioFactory.getInstance();
		this.out1=gpioController.provisionDigitalOutputPin(out1,PinState.LOW);
		this.out1.setShutdownOptions(true,PinState.LOW);
		
		this.out2=gpioController.provisionDigitalOutputPin(out2,PinState.LOW);
		this.out2.setShutdownOptions(true,PinState.LOW);
		
		
		
		this.pca9685=pca9685;
		
		this.pwm=pwm;
	}
	
//method
	public void setSpeed(int step){
	//step 0~4095 까지 총 4096 단계 
	pca9685.setStep(pwm, step);
	}
	public void forward(){
		out1.high();
		out2.low();
	
	}
	public void backward(){
		out1.low();
		out2.high();
		
	}
	public void stop(){
		out1.low();
		out2.low();
		
		setSpeed(0);
	}
	public static void main(String[]args) throws Exception{
		PCA9685 pca9685=PCA9685.getInstance();
		DCMotor motorB=new DCMotor(RaspiPin.GPIO_02,RaspiPin.GPIO_03,pca9685,PCA9685.PWM_O4);
		DCMotor motorA=new DCMotor(RaspiPin.GPIO_00,RaspiPin.GPIO_01,pca9685,PCA9685.PWM_O5);
		motorA.forward();
		motorB.forward();
		motorA.setSpeed(4095);
		motorB.setSpeed(4095);
		Thread.sleep(5000);
		motorA.stop();
		motorB.stop();
	}
	
	
}

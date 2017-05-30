package hardware.motor;

import com.pi4j.gpio.extension.pca.PCA9685GpioProvider;
import com.pi4j.gpio.extension.pca.PCA9685Pin;
import static com.pi4j.gpio.extension.pca.PCA9685Pin.PWM_00;
import static com.pi4j.gpio.extension.pca.PCA9685Pin.PWM_01;
import static com.pi4j.gpio.extension.pca.PCA9685Pin.PWM_02;
import static com.pi4j.gpio.extension.pca.PCA9685Pin.PWM_03;
import static com.pi4j.gpio.extension.pca.PCA9685Pin.PWM_04;
import static com.pi4j.gpio.extension.pca.PCA9685Pin.PWM_05;
import static com.pi4j.gpio.extension.pca.PCA9685Pin.PWM_06;
import static com.pi4j.gpio.extension.pca.PCA9685Pin.PWM_07;
import static com.pi4j.gpio.extension.pca.PCA9685Pin.PWM_08;
import static com.pi4j.gpio.extension.pca.PCA9685Pin.PWM_09;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CFactory;
import java.math.BigDecimal;

public class PCA9685 {
//필드

	private static PCA9685 singleton;

	public static PCA9685 getInstance() throws Exception {
		if (singleton == null) {
			singleton = new PCA9685();
		}
		return singleton;
	}
	private PCA9685GpioProvider gpioProvider;
	private static final Pin PWM_OC = PCA9685Pin.PWM_00;
	private static final Pin PWM_O1 = PCA9685Pin.PWM_01;
	private static final Pin PWM_O2 = PCA9685Pin.PWM_02;
	private static final Pin PWM_O3 = PCA9685Pin.PWM_03;
	private static final Pin PWM_O4 = PCA9685Pin.PWM_04;
	private static final Pin PWM_O5 = PCA9685Pin.PWM_05;
	private static final Pin PWM_O6 = PCA9685Pin.PWM_06;
	private static final Pin PWM_O7 = PCA9685Pin.PWM_07;
	private static final Pin PWM_O8 = PCA9685Pin.PWM_08;
	private static final Pin PWM_O9 = PCA9685Pin.PWM_09;
	private static final Pin PWM_10 = PCA9685Pin.PWM_10;
	private static final Pin PWM_11 = PCA9685Pin.PWM_11;
	private static final Pin PWM_12 = PCA9685Pin.PWM_12;
	private static final Pin PWM_13 = PCA9685Pin.PWM_13;
	private static final Pin PWM_14 = PCA9685Pin.PWM_14;
	private static final Pin PWM_15 = PCA9685Pin.PWM_15;

	private int period;

	//생성자 
	private PCA9685() throws Exception {
		I2CBus i2cBus = I2CFactory.getInstance(I2CBus.BUS_1);
		//0x40 PCA9685 모듈의 I2C 장치 번호 
		//pwm 주파수를 50hz 로 설정(SG90 servo motor 가 50 Hz 에서 동작 하기 때문)
		gpioProvider = new PCA9685GpioProvider(i2cBus, 0x40, new BigDecimal(50));
		//한 사이클당 시간 (period):1초간/Frequencey=1/50HZ=0.02s=20ms=20000us
		period = gpioProvider.getPeriodDurationMicros();

		//GPIO PWM 출력핀 설정
		GpioController gpioController = GpioFactory.getInstance();
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_00);
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_01);
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_02);
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_03);
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_04);
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_05);
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_06);
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_07);
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_08);
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_09);
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_10);
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_11);
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_12);
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_13);
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_14);
		gpioController.provisionPwmOutputPin(gpioProvider, PWM_15);

		gpioProvider.reset();

	}
	//메소드
public void setDuration(Pin pin,int duration){//하이 시간 
	//duration:0~19999us 듀레이션은 하이상태를 말한다.원래는 사이클이 있어야 한다.(20000일경우 사이클이 형성이 되지 않는다.)
	if(duration>=period){
		duration=(period-1);
	}else if(duration<0){
		duration=0;
	}
	if(duration!=0){
	gpioProvider.setPwm(pin, duration);//duration 으로 제어하는것과 단계로 제어하는것 두개가 있다.
	}else{
		gpioProvider.setAlwaysOff(pin);
	}
}
public void setStep(Pin pin,int step){
	//step:0~4095
	if(step>=4096){
		step=4095;
	}else if(step<0){
		step=0;
	}
	if(step!=0){
	gpioProvider.setPwm(pin,0,step);
	}else{
		gpioProvider.setAlwaysOff(pin);
	}
}
	public static void main(String[] args) throws Exception {
		PCA9685 pca9685 = PCA9685.getInstance();
		while(true){
		//0도로 회전
			pca9685.setStep(PWM_OC, 164);
		//pca9685.setDuration(PWM_00, 750);
		//90도로 회전
			//pca9685.setDuration(PWM_00,(750+2300)/2);
		pca9685.setStep(PWM_OC, 358);
		//350도회전
		pca9685.setStep(PWM_OC, 552);
		//pca9685.setDuration(PWM_00, 2300);
	
			
	}
	}

}

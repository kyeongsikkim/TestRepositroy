package hardware.motor;

import com.pi4j.io.gpio.Pin;

public class SG90ServoPCA9685Duration {
//Field

	private PCA9685 pca9685;
	private Pin pin;
	private int angle;
	private int minDuration;
	private int maxDuration;

//constructor
	public SG90ServoPCA9685Duration(PCA9685 pca9685, Pin pin, int minDuration, int maxDuration) {
		this.pca9685 = pca9685;
		this.pin = pin;
		this.minDuration = minDuration;
		this.maxDuration = maxDuration;

	}

	public SG90ServoPCA9685Duration(PCA9685 pca9685, Pin pin) {
		//1단계 (단위 펄스 시간)=20ms/4096 =0.004884ms
		//0 도 (0.8ms):0.8/0.004884=164단계
		//180도(2.7ms):2.7/0.004884=552단계
		this(pca9685, pin, 800, 2700);
	}

//method
	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		if (angle < 0) {
			angle = 0;
		} else if (angle > 180) {
			angle = 180;
		}
		this.angle = angle;
		int Duration = minDuration + (int) (angle * (maxDuration - minDuration) / 180.0);
		this.pca9685.setDuration(pin, Duration);
	}

	public static void main(String[] args) throws Exception {
		PCA9685 pca9685 = PCA9685.getInstance();
		//15가 위에 모토 14 가 밑에 모토 11 이 거리 측정 센서
		SG90ServoPCA9685Duration servo = new SG90ServoPCA9685Duration(pca9685, PCA9685.PWM_15);
	
		for(int i=10;i<100;i+=10){
		servo.setAngle(10);
		Thread.sleep(500);
		servo.setAngle(90);
		Thread.sleep(500);
		servo.setAngle(170);
		Thread.sleep(500);
		
		}
	



	}
}

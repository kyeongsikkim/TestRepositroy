package com.mycompany.myapp.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dao.GasSensorDao;
import com.pi4j.io.gpio.RaspiPin;

import hardware.converter.PCF8591;
import hardware.motor.PCA9685;
import hardware.motor.SG90ServoPCA9685Duration;
import hardware.sensor.GasSensor;
import hardware.sensor.UltrasonicSensor;

@Component
public class SensingCarServiceImpl implements SensingCarService{
	/*private PCA9685 pca9685;
	
	public SensingCarServiceImpl() throws Exception {//component 를 붙은 곳에는 component 를 붙이지 않는 것이 좋다.
		pca9685 = PCA9685.getInstance();
	}*/
	@Autowired
	private GasSensorDao dao;
	//하드웨어 pwm 
	private PCA9685 pca9685;
	
	
	
	//초음파 센서 회전 및 관련 필드
	private UltrasonicSensor ultrasonicSensor;
	private 	SG90ServoPCA9685Duration ultrasonicSensorservo;
	
	//GAS 센서 관련 필드 
	private GasSensor gasSensor;
	private PCF8591 gasSensorPCF8591;
	@PostConstruct //impl 클래스가 만들어지는 즉시 초기화로 만들어준다. 생성자가 실행되고 나고서 초기화해준다.
	public void init()throws Exception{
		 pca9685=PCA9685.getInstance();
		
		 ultrasonicSensor=new UltrasonicSensor(RaspiPin.GPIO_28, RaspiPin.GPIO_29);
		 ultrasonicSensorservo= new SG90ServoPCA9685Duration(pca9685, PCA9685.PWM_11);
		 
		 gasSensorPCF8591=new PCF8591(0x48,PCF8591.AIN2);
		 gasSensor=new GasSensor(gasSensorPCF8591,RaspiPin.GPIO_23);
	}
	
	@Override
	public void changeUltrasonicSensorAngle(int angle) throws Exception {
		ultrasonicSensorservo.setAngle(angle);		
	}

	@Override
	public int getUltrasonicSensorDistance() {
		
		int distance=ultrasonicSensor.getDistance();
		return distance;
	}
	@Override
	public double getGasSensorValue() throws Exception {
		//센서로부터 측정값 받기
		double value=gasSensor.getValue();
		
		//DB 에 저장.full name 으로 집어 넣어준다. 위에 hardware 가 있어서 그렇다.
		com.mycompany.myapp.dto.GasSensor gasSensorBean=new com.mycompany.myapp.dto.GasSensor();
		gasSensorBean.setGvalue(value);
		dao.insert(gasSensorBean);
		return value;
	}

}

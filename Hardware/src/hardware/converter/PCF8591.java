package hardware.converter;

import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;
import java.io.IOException;

public class PCF8591 {
	
public static final int AIN0=0x40;//상수화 시켜놓고 사용하자
public static final int AIN1=0x41;
public static final int AIN2=0x42;
public static final int AIN3=0x43;

private int i2cAddress;
private int ainNo;
private int analogVal;

//생성자
public PCF8591(int i2cAddress,int ainNo){
	this.i2cAddress=i2cAddress;
	this.ainNo=ainNo;
	
	}
public int analogRead() throws Exception{
	I2CBus i2cBus=I2CFactory.getInstance(I2CBus.BUS_1);//bus 핀번호가 두개 있지만 내부적으로 하나를 사용하고 있어서 하나만 사용해야 한다.
	I2CDevice i2cDevice=i2cBus.getDevice(i2cAddress);//실제로는 48번이 와야한다.
	i2cDevice.read(ainNo);//dummy read를 한번 해준다.
	analogVal=i2cDevice.read(ainNo);//0~255값중 하나 
	return analogVal;
}
public void analogWrite(byte value) throws Exception{
	//Ain0,1,2,3,  중에 아무곳에나 신호를 주면 나온다.
	I2CBus i2cBus=I2CFactory.getInstance(I2CBus.BUS_1);
	I2CDevice i2cDevice=i2cBus.getDevice(i2cAddress);
	i2cDevice.write(AIN0,value);
	
}
public static void main(String[]args) throws Exception{
	PCF8591 test =new PCF8591(0x48,AIN0);
	while(true){
		int value=test.analogRead();
		test.analogWrite((byte)value);
		System.out.println(value);
		Thread.sleep(200);
	}
	
}
}

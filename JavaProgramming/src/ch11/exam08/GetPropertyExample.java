package ch11.exam08;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		String osName=System.getProperty("os.name");
		String userName=System.getProperty("user.name");
		Properties props=System.getProperties();//반환 할 수있는 타입이 이것이다.
		Set keys=props.keySet();
		for(Object objkey: keys){//키값과 value 는 항상 문자열 형태이다?
			String key=(String)objkey;
			String value=System.getProperty(key);
			System.out.println("["+key+"]" +value);
		}
	}

}

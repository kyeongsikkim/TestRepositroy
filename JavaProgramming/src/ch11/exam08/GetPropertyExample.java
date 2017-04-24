package ch11.exam08;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		String osName=System.getProperty("os.name");
		String userName=System.getProperty("user.name");
		Properties props=System.getProperties();//��ȯ �� ���ִ� Ÿ���� �̰��̴�.
		Set keys=props.keySet();
		for(Object objkey: keys){//Ű���� value �� �׻� ���ڿ� �����̴�?
			String key=(String)objkey;
			String value=System.getProperty(key);
			System.out.println("["+key+"]" +value);
		}
	}

}

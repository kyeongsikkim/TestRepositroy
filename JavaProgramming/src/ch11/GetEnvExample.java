package ch11;

import java.util.Map;
import java.util.Set;

public class GetEnvExample {

	public static void main(String[] args) {
		String userName=System.getenv("USERNAME");
		Map map=System.getenv();//반환 할 수있는 타입이 이것이다.
		Set keys=map.keySet();
		for(Object objkey: keys){//키값과 value 는 항상 문자열 형태이다?
			String key=(String)objkey;
			String value=System.getenv(key);
			System.out.println("["+key+"]" +value);
		}
	}

}

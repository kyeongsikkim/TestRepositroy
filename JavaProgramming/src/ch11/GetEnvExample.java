package ch11;

import java.util.Map;
import java.util.Set;

public class GetEnvExample {

	public static void main(String[] args) {
		String userName=System.getenv("USERNAME");
		Map map=System.getenv();//��ȯ �� ���ִ� Ÿ���� �̰��̴�.
		Set keys=map.keySet();
		for(Object objkey: keys){//Ű���� value �� �׻� ���ڿ� �����̴�?
			String key=(String)objkey;
			String value=System.getenv(key);
			System.out.println("["+key+"]" +value);
		}
	}

}

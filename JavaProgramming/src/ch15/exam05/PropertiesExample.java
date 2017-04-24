package ch15.exam05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {//발생할 수 있는 exception을 발생 시켜준다.
		Properties prop=new Properties();
		String path=PropertiesExample.class.getResource("database.properites").getPath();//클래스가 있는 곳에서 파일을 찾는데 파일 이름이 이것이다. 이런 의미이다. 
		//데이타 베이스 프로포티 파일은  현재 클래스 위치한곳에서 파일을 찾겠다 그파일을 찾으면 전체 경로를 얻어다오 이런뜻이다.
		prop.load(new FileReader("D:/IotCourse/EclipseWorkspace/JavaProgramming/src/ch15/exam05/database.properties"));//클래스와 보통 같이 있다.프로포티 파일은 클래스와 항상가까이 있다.
		//현재 클래스를 기준으로 해서 상대 경로를 얻고 싶다.
		prop.load(new FileReader(path));
		String driver=prop.getProperty("driver");
		System.out.println(driver);
		String manager=prop.getProperty("manager");
		System.out.println(manager);
	}

}

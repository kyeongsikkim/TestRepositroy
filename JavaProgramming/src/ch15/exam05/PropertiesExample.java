package ch15.exam05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {//�߻��� �� �ִ� exception�� �߻� �����ش�.
		Properties prop=new Properties();
		String path=PropertiesExample.class.getResource("database.properites").getPath();//Ŭ������ �ִ� ������ ������ ã�µ� ���� �̸��� �̰��̴�. �̷� �ǹ��̴�. 
		//����Ÿ ���̽� ������Ƽ ������  ���� Ŭ���� ��ġ�Ѱ����� ������ ã�ڴ� �������� ã���� ��ü ��θ� ���ٿ� �̷����̴�.
		prop.load(new FileReader("D:/IotCourse/EclipseWorkspace/JavaProgramming/src/ch15/exam05/database.properties"));//Ŭ������ ���� ���� �ִ�.������Ƽ ������ Ŭ������ �׻󰡱��� �ִ�.
		//���� Ŭ������ �������� �ؼ� ��� ��θ� ��� �ʹ�.
		prop.load(new FileReader(path));
		String driver=prop.getProperty("driver");
		System.out.println(driver);
		String manager=prop.getProperty("manager");
		System.out.println(manager);
	}

}

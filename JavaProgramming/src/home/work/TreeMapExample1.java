package home.work;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		TreeMap<Integer,String>scores=new TreeMap<Integer,String>();
		scores.put(new Integer(87), "ȫ�浿");
		scores.put(new Integer(98), "�̵���");
		scores.put(new Integer(75), "�ڱ��");
		scores.put(new Integer(95), "�ſ��");
		scores.put(new Integer(80), "���ڹ�");
		
		Map.Entry<Integer, String>entry=null;
		entry=scores.firstEntry();
		System.out.println("���� ���� ����:"+entry.getKey()+"-"+entry.getValue());
		entry=scores.firstEntry();
		System.out.println("���� ���� ����:"+entry.getKey()+"-"+entry.getValue());
		entry=scores.firstEntry();
		System.out.println("���� ���� ����:"+entry.getKey()+"-"+entry.getValue());
	}

}

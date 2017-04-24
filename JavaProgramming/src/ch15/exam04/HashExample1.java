package ch15.exam04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashExample1 {

	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<String,Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수:"+map.size());
	
		System.out.println("\t홍길동"+map.get("홍길동"));
		
		//Set<String>keyset=map.keySet();//맵에 있는 키값들을 빼서 keyset 에다가 넣는다  키값을 알지 못해서 
		Iterator<String>keyIterator=map.keySet().iterator();//set 에 있는 것들을 하나씩 뽑아낸다.
		while(keyIterator.hasNext()){
			String key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println("\t"+key+" "+value);
		}
		map.remove("홍길동");
		System.out.println("총 Entry 수:"+map.size());
		Set<Map.Entry<String, Integer>>entrySet=map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator=entrySet.iterator();
		
		while(entryIterator.hasNext()){
			Map.Entry<String, Integer>entry=entryIterator.next();
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println(key+""+value);
		}
		map.clear();
		}
	}


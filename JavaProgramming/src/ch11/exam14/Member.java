package ch11.exam14;

public class Member implements Comparable<Member>{//member 을 comparable 로 변형을 시킬 수 있어야 한다. comparable 는 interface 이기 때문에 일단 Member 은 구현을 해야 된다.Member 끼리 비교해야 된다.
private String name;
private int age;

public Member(String name,int age){
	this.name=name;
	this.age=age;
}
@Override
	public String toString() {
		return name+"-"+age;
	}

@Override
public int compareTo(Member o) {
	//return Integer.compare(age,o.age);
	//return age-o.age;//String 이 갖고 있는 것 사전순으로 먼저오는지
	//return name.compareTo(o.
	if(age<o.age){
		return -1;
	}else if(age==o.age){
		return 0;
	}else{
		return 1;
	}
}
}

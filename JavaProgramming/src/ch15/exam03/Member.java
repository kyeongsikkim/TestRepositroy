package ch15.exam03;

public class Member {
	public String name;
	public int age;

	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return name.hashCode()+age;//결국은 두개의 값이 해쉬 코드가 같으면된다. 
	}
	@Override
	public boolean equals(Object obj) {//오브젝트의 equals 의 경우는 객체 가 같냐 다르냐만 판단을 한다.
		if(obj instanceof Member){
			Member member=(Member)obj;//먼저 강제 형 변환을 시켜줘야 한다.
			if(name.equals(member.name) && member.age==age){//내용을 비교 할때는 equals를 사용한다. hashset 기존에 있는 이름과 기존 나이랑 비교를 한다.
				return true;
			}
		}
		return false;
	}
}

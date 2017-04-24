package ch11.exam04;

public class Member {
//Field
	private String id;
	public Member(String id){
		this.id=id;
	}
	//재정의 한다.
	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}
}

//이것은 obj 로 부터 상속 받은 것이다.
//syso(); 재정의는 무조건 상속을 받아서 사용하는것이다.
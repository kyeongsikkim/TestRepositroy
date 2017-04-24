package ch11.exam01;

public class Member {
//Field
	private String id;
//constructor
	public Member(String id){
		this.id=id;
	}
//Method
	@Override//오버라이드 가능한 이유는 object 로 부터 상속을 받았기 때문에 obj 의 메소드를 재정의 가능한 것이다.extends 는 항상 상속이 된것이다. 
		public boolean equals(Object obj) {
		if(obj instanceof Member){//obj 로 들어온것이 멤버인지 확인 왜나하면 모든 객체를 다받아 들일수 있다. 
			Member target=(Member)obj;
			if(id.equals(target.id)){
				return true;
			}
		}
		return false;
	}
}
//이것은 obj 로 부터 상속 받은 것이다.

package ch06.exam09;

 public class Member {
	//필드 
	String name;
	//private String ssn;프라이빗을 걸게 되면은 아예밖에서 접근을 하지 못한다. 변경을 하지도 못한다.
	final String ssn;//외부에서 접근 가능하지만 값을 생성 할때 한번주고나면 변경 불가
	static final  String NATION="한국";//상수의 개념 을 사용할때는 다 대문자로 하는게 관례이다. 이것은 객체에 다 포함되어있지않구 값이 고정적으로 갖는 필드이다.
	//객체마다 값을 가지고 있을 필요가 없고 공통적으로 사용하는것  클래스 필드이기는 하다. 한 패키지 안에서는 가능하다.
	//클래스 자체는 메소드영역에 로드가 된다. static 는 객체에 포함되지않고 메소드 영역에 있다. 인스턴스 메소드는 객체를 생성해야지 사용할 수있다.
	/*static{
		//이블럭안에서 값을 한번을 넣어 줄 수는 있다.
		 //사용을 거의하지 않는다.
	}
	*/
	Member(String name,String ssn){
		this.name=name;
		this.ssn=ssn;
	}
}
//static 에 대한 이해 싱클톤 이해 
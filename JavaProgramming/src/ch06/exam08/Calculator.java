package ch06.exam08;

public class Calculator {
	//static 으로 생성자를 사용하면 올리는 순간 객체가 생성된다.
	//singleton 의 생성장소는 메소드 메모리 영역에 생성이 되는것이다.
	//final 은 값을 생성자에서 한번 넣어줄 수 있다.
	//큰 구조를 살펴 보면은 
	//static final  곧 상수가 된다. 이것은 공통으로 사용할수있고 값을 넣어 줄수 있다.
  private static Calculator singleton=new Calculator();//프라이빗이 걸리면 접근을 할 수가 없다. 프라이빗을 안걸어주면 외부에서 접근이 가능하다.
  //메소드가 아니기 때문에 호출 할때마다 생성이 되는 것은 아니다. 한번 만들어 놓은 singleton 안에 주소값을 저장해놓는 것이다.
	private Calculator(){//나 개인적인거기 때문에 외부에서는 호출을 할 수가 없다private 는 클래스를 벗어나면 사용 할 수 없다.
	}
	static Calculator getInstance(){
		return singleton;
	}
}

package ch07.home;

public class Child extends Parent {
@Override
public void method2() {
	System.out.println("Child-method");
}
public void method3(){
	System.out.println("Child-method3()");
}
}
//roll 이라는 메소드가 반드시 필요하다.
//규격을 반드시 지키려고 규격을 만들어서 적용을 할 수 있도록 하는것
//실체 완성된 설계도 공통된 특성을 추출한 것을 말한다.
//추상 클래스는 실체 클래스이 부모 클래스역할을 할 수있다.
package ch14.exam02;
@FunctionalInterface//인터페이스가 람다식으로 변경이 가능한지 확인 해준다 함수적 인터페이스로 만들 수 있게 하기 위해서 추상메소드가 반드시 하나만 있어야 한다.
//컴파일러한테 검증을 받고 싶다면 
public interface FunctionalInterface1 {
	public void method();
}

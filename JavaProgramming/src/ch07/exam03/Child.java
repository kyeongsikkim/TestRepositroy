package ch07.exam03;

public class Child extends Parent{
//Field 필드나 메소드나 생성자의 위치는 중요하지 않다.
	String firstName;
//Constructor
	Child(String lastName,String firstName){
		super(lastName);
		//super("김")//부모 클래스에서는 매개변수가 있는 생성자를 만들었으면 안에 값을 넣어줘야 한다.그렇기 때문에 여기에서도 값을 넣어줘야 한다.
		//super 를 안적어줘도 컴파일러는 알아서 기본 super 파일을 만들어 준다.
	this.firstName=firstName;
	}
//Method
	void play(){
		System.out.println("놀아요");
	}
	@Override
		void sound() {
			// TODO Auto-generated method stub
			super.sound();
		}
	
	/*@Override
	void sound(){//이렇게 타입을 가질 수가 없다. 상속을 받으면 
		System.out.println("낄낄");
	}*/
	
	/*void sound( int i){
		
	}*/
	/*int sound(){ 타입이 다른 메소드를 갖을 수 없다.
	 * 재정의 받을 때는 타입은 똑같아야 한다.
	 * 같은 이름으로 반환타입이 다른것을 사용 할수는 없다.
	 * 반환 타입이 다르게 하여 메소드 이름을 같게 생각 할수 없다.
	 * 실수를 안하기 위해서 재정의 된것인지 아닌지 알수 있는 방법 
	 * 오버라이드 를 붙여서 재정의 된것인지 아닌지 확인 한다.
	 * @override
	 * void sounb(){//재정의를 했다고 하지만 실수를 할 수도있다. 그렇기 때문에 재정의 된것인지 확인하는 방법
	 * syso("낄낄")
	}*/
}

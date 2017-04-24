package home.work;

public class Robot {
//Field
	Body body=new Body();
	Head head=new Head();
	Arm[]arm={new Arm("왼쪽팔"),new Arm("오른쪽팔")};
	Leg[]leg={new Leg("왼쪽다리"),new Leg("오른쪽다리")};
	String name;
	String color;
	
	//로봇 생성자
	Robot(String name,String color){
		this.name=name;
		this.color=color;
	}
	//파워 키고 끄기
	void powerOn(){
		body.start();
		headMove();
		
	}
	void powerOff(){
		body.stop();
	}
	//머리 움직임 
	void headMove(){
		head.up();
		head.down();
		head.left();
		head.right();
	}
	//
	void armMove(){
		arm[0].move();
		arm[1].move();
	}
	//객체 자기 자신을 가리키는 것은this 이다. 생성자 가 생성이 안되었는데 객체를 그래도 쓸수있나? 생성자는 객체를 생성하는 것을 한다.new 라는 연산자를 쓸때 메모리가 확보되고
	//필드라는 것을 가진다.객체는new라는 것을 할때 생성이 되는것이고 생성자가 완료가 됐을 때 완벽한 객체가 된다.
	//객체를 만들때 
	//부품 교체하기 
}

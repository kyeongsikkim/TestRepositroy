package ch06.exam10.product;

//import ch06.exam10.parts.Engine;
//import ch06.exam10.parts.Tire;//다른 패키지에 있는 것을 사용 할때는 import 를 사용해야 된다.
//import ch06.exam10.parts.* 패키지 안에서 알아서 찾아서 써라 이런뜻이다.
import ch06.exam10.parts.*;
import ch06.exam10.parts2.*; 
public class Car {
	//ch06.exam10.parts.Engine engine=new ch06.exam10.parts.Engine();
	Engine engine=new Engine();
	//Tire tire=new Tire();//이렇게 다른 패키지에 똑같은 이름의 클래스가 있다면은 명확하게 구분지어줘야한다.
	ch06.exam10.parts2.Tire tire=new ch06.exam10.parts2.Tire();
}

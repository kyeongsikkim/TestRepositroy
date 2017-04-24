package home.work;
//이동 거리 측정 가능 하기 위해서 필요한 메소드는? 
public class Leg {
	String location;
	
	Leg(String location){
	this.location=location;	
	}
	void legMove(String location){
		System.out.println(location +"발 움직입니다");
	}
}

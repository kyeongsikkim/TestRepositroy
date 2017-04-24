package home.work;
//팔에 필요한 필드값과 필요한기능은?
public class Arm {
	//field
	String location;
	
	Arm(String location){
		this.location=location;
	}
	void move(){
		System.out.println(location +" 움직입니다.");
	}
}

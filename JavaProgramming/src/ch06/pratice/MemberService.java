package ch06.pratice;

public class MemberService {
	//필드값
	String id;
	String password;
	//생성자
	MemberService(){
		//메소드
	}
	boolean login(String id,String password){
		if(id.equals("hong") && password.equals("12345")){
			return true;	
		}else
			return false;
	}
	void logout(String id){
		if(id.equals("hong"))
			System.out.println("로그아웃 되었습니다");
		}
	}

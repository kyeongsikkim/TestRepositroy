package ch06.pratice;

public class MemberService {
	//�ʵ尪
	String id;
	String password;
	//������
	MemberService(){
		//�޼ҵ�
	}
	boolean login(String id,String password){
		if(id.equals("hong") && password.equals("12345")){
			return true;	
		}else
			return false;
	}
	void logout(String id){
		if(id.equals("hong"))
			System.out.println("�α׾ƿ� �Ǿ����ϴ�");
		}
	}
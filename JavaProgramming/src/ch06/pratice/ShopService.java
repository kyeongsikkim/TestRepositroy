package ch06.pratice;

public class ShopService {
	private static ShopService shopservice=new ShopService();//외부에서 접근을 하지 못하게
	//만약에 static 를 사용안하게 된다면 인스턴스 필드이기 때문에 객체가 생성되야지 사용을 할 수 있다.
	private ShopService(){
		
	}
	static ShopService getInstance(){
		return shopservice;
	}
}

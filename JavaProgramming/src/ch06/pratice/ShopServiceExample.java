package ch06.pratice;

public class ShopServiceExample {

	public static void main(String[] args) {
	ShopService obj1=ShopService.getInstance();
	ShopService obj2=ShopService.getInstance();
	if(obj1==obj2){
		System.out.println("���� ��ü �Դϴ�");
	}else{
		System.out.println(" �ٸ� ��ü �Դϴ�.");
	}
	}

}

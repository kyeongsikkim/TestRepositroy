package ch06.pratice;

public class ShopService {
	private static ShopService shopservice=new ShopService();//�ܺο��� ������ ���� ���ϰ�
	//���࿡ static �� �����ϰ� �ȴٸ� �ν��Ͻ� �ʵ��̱� ������ ��ü�� �����Ǿ��� ����� �� �� �ִ�.
	private ShopService(){
		
	}
	static ShopService getInstance(){
		return shopservice;
	}
}

package ch06.exam02;
//�ϳ��� ������Ʈ�ȿ����� �ϳ��� ���������� �޼ҵ常 ������ �ȴ�.�̷��� ���� �ʰ� ������ ������Ʈ �ȿ� �����ϳ��� �����.
public class CarExample {

	public static void main(String[] args) {
	 //new Car();//�̷��� �ϸ��� heap ������ ������ �Ǿ����� ��ġ�� ����ִ��� �𸥴�. �׷��� ����� �� ���� ���� ���̵ȴ�. �׷��� ������ ��� ���� �Ǿ��ִ��� �˷���
	 //�� �ȴ�. ������ �ϸ鼭 ������ �ȿ� �ִ� ���� ������ �Ѵ�.
		Car myCar=new Car(); //ī Ÿ������ mycar �������� ����� new Car�� ��ü�� ���� ��ġ ������ �˷��ְڴ�.��ü �ϳ� �����Ѱ��̴�.
		System.out.println(myCar.company);
		System.out.println(myCar.speed);
		System.out.println(myCar.color);
		System.out.println(myCar.airback);
		
		Car yourCar=new Car("����",true);
		System.out.println(myCar.company);
		System.out.println(myCar.speed);
		System.out.println(myCar.color);
		System.out.println(myCar.airback);
		
		yourCar=new Car("����",false);
		System.out.println(yourCar.company);
		System.out.println(myCar.speed);
		System.out.println(myCar.color);
		System.out.println(myCar.airback);
	}
//��ü�� ����� ���ؼ��� ������ �ݵ�� �־�� �Ѵ�. ��� ��ü�� ����� ���ؼ��� null�� �־��༭ ���� �ش�. �׷��� �ּҸ� ��ã�� �Ǿ ������ ��ü�� �ȴ�.
}

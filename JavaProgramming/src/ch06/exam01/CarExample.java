package ch06.exam01;
//�ϳ��� ������Ʈ�ȿ����� �ϳ��� ���������� �޼ҵ常 ������ �ȴ�.�̷��� ���� �ʰ� ������ ������Ʈ �ȿ� �����ϳ��� �����.
public class CarExample {

	public static void main(String[] args) {
	 //new Car();//�̷��� �ϸ��� heap ������ ������ �Ǿ����� ��ġ�� ����ִ��� �𸥴�. �׷��� ����� �� ���� ���� ���̵ȴ�. �׷��� ������ ��� ���� �Ǿ��ִ��� �˷���
	 //�� �ȴ�. ������ �ϸ鼭 ������ �ȿ� �ִ� ���� ������ �Ѵ�.
		Car myCar=new Car(); //ī Ÿ������ mycar �������� ����� new Car�� ��ü�� ���� ��ġ ������ �˷��ְڴ�.��ü �ϳ� �����Ѱ��̴�.
		//.��ü�� �����ؼ� ��ü�� ������ �ִ� ����� ����Ҽ��ִ�. ��ü ������ 
		Car yourCar=new Car();//�ϳ��� ���������� �ΰ����� ��ü�� ��Ÿ��������. �׷��� ���� �������� ���� �� ����.
		//��ü �޼ҵ� ȣ��
		myCar.run();
		System.out.println(myCar.company);
		System.out.println(myCar.speed);//��ü�� ������ �Ǹ鼭 �ʵ�� �ڵ����� �ʱ�ȭ �� �ȴ�.
		
		//������ �����ϱ��� ���� �־����� ������ ������ �ȵȴ�.
		System.out.println(myCar.color);
		System.out.println(myCar.airback);
		System.out.println(myCar.xx[0]);
		
		myCar.speed=30;
		myCar.color="���";
		myCar.run();
		System.out.println(myCar.speed);//��ü�� ������ �Ǹ鼭 �ʵ�� �ڵ����� �ʱ�ȭ �� �ȴ�.
		//������ �����ϱ��� ���� �־����� ������ ������ �ȵȴ�.
		System.out.println(myCar.color);
	}
//��ü�� ����� ���ؼ��� ������ �ݵ�� �־�� �Ѵ�. 
}

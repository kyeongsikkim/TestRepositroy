package ch06.exam04;

public class CarExample {

	public static void main(String[] args) {
		Car myCar=new Car("2017-03-28","����");
		//Engine�� �޼ҵ� ȣ�� 
		myCar.engine.start();
		
		//Dashboard �� �޼ҵ� ȣ��
		myCar.dashboard.display(60);
		
		//Tire�� �ʵ尪 �ϱ� 
		System.out.println(myCar.tires[0].location);
		
		myCar.tires[2].roll();
		//car�� �޼ҵ� ȣ��
		myCar.start();
		
		myCar.run();
		//---------------------------------------------
		//tire(���� )��ǰ��ü 
		myCar.tires[1]=new Tire("������");//��ü�� �����Ű�� ���̴�.
		myCar.run();
	}

}

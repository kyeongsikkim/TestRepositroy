package ch06.exam03;

//import ch06.exam02.Car;//import �� ��Ű���� Ŭ������ ������� �̷������.��Ű���� �ҹ��� Ŭ������ �빮��
//import �� ������ �Ͷ� ch06.exam02.car �� ������ �Ƽ� ��� �ܺο� �����ϴ� ���赵�� ������ �ö� ��� �� �� �ְ� 
//���� ��Ű�� �ȿ� �ִ� ���� import �ʿ� ����.
public class Calculator {
	//�ʵ�

	//������
	//�޼ҵ�
	//�޼ҵ� ù�ڴ� �ҹ��ڷ� �ϴ°� ���� Ŭ�������� �빮�� ��Ű���� �ҹ���
	void powerOn(){
	 System.out.println("������ �մϴ�");
	}
	void powerOff(){
		System.out.println("������ ���ϴ�");
	}

	String info(){
		return "�Ｚ����-2017-03.28"; 
	}
	int plus(int x,int y){//��ȯ Ÿ���� �� �� �� �ִ�.//�޼ҵ� ����
		int result=x+y;
		return result;
	}
	//�޼ҵ� �����ε� �� ���� Ÿ���� ������ ����.�����ε��� �Ű� ������ ���̰� �ִ�.
	//�����ε��� �����ڿ� �޼ҵ忡 ����µ� �Ȱ��� �̸� �̶� �Ű������� �ٸ��� �� ��� �� �� �ִ�.
	double plus(double x,double y){//��ȯ Ÿ���� �� �� �� �ִ�.//�޼ҵ� ����
		double result=x+y;
		return result;
	}
	double divide(double x,double y){
		double result=x/y;
		return result;
	}
	int[]changeArray(int x,int y,int z){
		int []array={x,y,z};
		return array;
	}
	//car ��� Ŭ������ ��� ã�Ƽ� �ϳ� 
	Car makeCar(String color,boolean airback){
		//new Car(color,airback);��ü�� ������ ������ ��ü�� ����Ű�� �ּҰ� ��� ������ ��ü�� �ȴ�.
		Car car=new Car(color,airback);
		return car;//car �� �ּ� ���� �Ѱ��ִ� ���̴�. Ÿ�Կ� �°� ������ ����� �Ѵ�.
	}

}
//���� ������ �� null �εȴ�.

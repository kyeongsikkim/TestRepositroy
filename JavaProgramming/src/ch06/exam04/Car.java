package ch06.exam04;

public class Car {
//Field �� �� �� �ִ°��� �ش簴ü �Ӹ� �ƴ϶� ��ü�� ����ǰ�� �ʵ�� ������ ���ִ�.Car ��� �ϴ� ������ �ʵ尡 ������ �ǰ� 
	Body body=new Body();//ī�ȿ� body ��ü�� ��������� ���� �ƴϴ�. Car�� �ܼ��� �����ϴ� ���̴�.
	Engine engine=new Engine();
	Dashboard dashboard=new Dashboard();
	//Seat []seat=new Seat[4];//seat ��ü�� ���� �迭�� �����
	Seat[]seat1={new Seat(),new Seat(),new Seat(),new Seat()};//�迭�ȿ� 4���� ��ü�� ���� �־��ش�.
	Tire[]tires={new Tire("�տ�"),new Tire("����"),new Tire("�ڿ�"),new Tire("����")};//��ü�� �����ؼ� �װ��� ����Ű�� �ּҸ� �˷��ָ� �ȴ�.
	String makeDay;
	String color;//��ü�� ��������� �ݵ�� �־�� �Ѵ�.
	int speed;//���µ����� ���÷� ���� �ٲ��.
	
//constructor
	Car(String makeDay,String color){
		this.makeDay=makeDay;
		this.color=color;
	}
//method
	void start(){
		engine.start();
	}
	void run(){
		tires[0].roll();//�ڽ� ��ü �ȿ� �ʵ�� �ֱ� ������ ���� ������ ���ϰ� �ٷ� ���� �ִ�.
		tires[1].roll();
		tires[2].roll();
		tires[3].roll();
		setSpeed(60);//��ü �ȿ��� �ڱ� �Լ��� ȣ�� �Ҷ��� ���� ������ �ʿ� ����.�ڱ��ڽžȿ��� �޼ҵ带 ȣ�� �ϴ� ���̴�. �޼ҵ带 ȣ�� �Ҷ��� ������ ���ؼ� ������ ������ 
		//�޼ҵ� �ȿ��� ȣ���� �Ҷ��� ���� �� �ʿ� ���� �����ϴ�.
		dashboard.display(60);
	}
	void setSpeed(int speed){
		this.speed=speed;
	}
	void stop(){
		engine.stop();
		speed=0;
	}
}

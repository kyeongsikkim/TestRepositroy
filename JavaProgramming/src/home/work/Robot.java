package home.work;

public class Robot {
//Field
	Body body=new Body();
	Head head=new Head();
	Arm[]arm={new Arm("������"),new Arm("��������")};
	Leg[]leg={new Leg("���ʴٸ�"),new Leg("�����ʴٸ�")};
	String name;
	String color;
	
	//�κ� ������
	Robot(String name,String color){
		this.name=name;
		this.color=color;
	}
	//�Ŀ� Ű�� ����
	void powerOn(){
		body.start();
		headMove();
		
	}
	void powerOff(){
		body.stop();
	}
	//�Ӹ� ������ 
	void headMove(){
		head.up();
		head.down();
		head.left();
		head.right();
	}
	//
	void armMove(){
		arm[0].move();
		arm[1].move();
	}
	//��ü �ڱ� �ڽ��� ����Ű�� ����this �̴�. ������ �� ������ �ȵǾ��µ� ��ü�� �׷��� �����ֳ�? �����ڴ� ��ü�� �����ϴ� ���� �Ѵ�.new ��� �����ڸ� ���� �޸𸮰� Ȯ���ǰ�
	//�ʵ��� ���� ������.��ü��new��� ���� �Ҷ� ������ �Ǵ°��̰� �����ڰ� �Ϸᰡ ���� �� �Ϻ��� ��ü�� �ȴ�.
	//��ü�� ���鶧 
	//��ǰ ��ü�ϱ� 
}

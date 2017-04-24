package ch07.exam01;

public class ChildExample {

	public static void main(String[] args) {
		Child child=new Child();//이렇게 했을 때 child 객체만들어 질까 아니면parent 객체도 만들어 질까? 상속을 받고 있다면 parent 객체도 생성이 된다.
		System.out.println(child.lastName);
		System.out.println(child.firstName);
		child.sound();
		child.play();
	}

}

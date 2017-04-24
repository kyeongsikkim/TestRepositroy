package ch07.exam04;

public class ChildExample {

	public static void main(String[] args) {
		Child child=new Child("김","길동");//자식의 생성자를 만들 때 생성자 안에 부모의 생성자를 만드는게 속해있다. 명시를 안해주면 알아서 만들어주고 명시를 하면은 
		//자식을 생성할때 부모의 생성자가 만들어진다. 부모의 사운드를 부를수있는 방법은 없다.
		System.out.println(child.lastName);
		System.out.println(child.firstName);
		child.sound();
		child.play();
	}

}

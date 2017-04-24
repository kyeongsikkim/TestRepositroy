package ch09.exam08;

public class ButtonExample {

	public static void main(String[] args) {
		Button button= new Button();
	/*	Button.OnClickListener OnClickListener=new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				
			}
		};*/
		//new 하구  컨트롤 스페이스 할경우 뜬다  해석을 할수 있어야 한다.
		button.setOnClickListener(new Button.OnClickListener() {//인터페이스를 구현한  클래스의 객체를 생성해서 넣어준다.
			
			@Override
			public void onClick() {
			System.out.println("서버에 접속 합니다.");
			}
		});
		button.touch();
	}

}

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
		//new �ϱ�  ��Ʈ�� �����̽� �Ұ�� ���  �ؼ��� �Ҽ� �־�� �Ѵ�.
		button.setOnClickListener(new Button.OnClickListener() {//�������̽��� ������  Ŭ������ ��ü�� �����ؼ� �־��ش�.
			
			@Override
			public void onClick() {
			System.out.println("������ ���� �մϴ�.");
			}
		});
		button.touch();
	}

}

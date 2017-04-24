package ch09.exam08;

public class Button {//�پ��� ����� ������ ���ؼ� ������ 
	//field
	private OnClickListener onClickListener;//�ʵ� ���� �����ָ� null �̵ȴ�.
	
	//constructor
	//mehtod
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	public void touch(){
		if(onClickListener!=null){
			onClickListener.onClick();
		}
	}
	//Nested Interface
	interface OnClickListener{//��ü�� �츮�� ��� �Ѵ�.
		void onClick();
	}

}
/*�ʵ�� �������̽� Ÿ���� �ִ�. �������̽��� button �ȿ� ���� �Ǿ��ִ�. �������̽��� ��ư�� �������� �ǹ̰� ����.
������ ���谡 �ִ�. �������ո��� �ʵ�� ������ �ߴ�.��ü ����� ���Ͻ�Ű�°� �������̽��� ��밡���� ��ü �� ����. �� �ڵ忡�� 
��ü�� ��� ���ñ�? ���Ϳ��� ��ü�� ���Եǰ� �ȴ�. �ܺο��� ��ü�� �������� onClickListener �� ������ �ǰ� �ȴ�. 
		13���ο��� �������̽� �� ������ �ǰ� �ȴ�. onClicListener.onClik() ������ �ȴ�. ������ onClick �� ������ �ǳĸ� �츮�� �־��� ��ü�� �����̵ȴ�.
		��ü�� ������ �ǰ� �ʵ��� ������ ���� �Ǹ��� ��ġ ���� �� ������ �ϰ� �ȴ�. �׶� onClicListener.onClik �� �������̽��� ���� �� �ȴ�.*/